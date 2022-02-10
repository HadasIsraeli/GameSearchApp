package com.example.gamesearcher.fragments;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gamesearcher.R;
import com.example.gamesearcher.recyleviewgames.CustomAdapter;
import com.example.gamesearcher.recyleviewgames.DataModel;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.firebase.ui.database.ObservableSnapshotArray;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


class LinearLayoutManagerWrapper extends LinearLayoutManager {

    public LinearLayoutManagerWrapper(Context context) {
        super(context);
    }

    public LinearLayoutManagerWrapper(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    public LinearLayoutManagerWrapper(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}

public class FragmentResultsPage extends Fragment {

    private RecyclerView recyclerView;
    CustomAdapter adapter;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public FragmentResultsPage() {
        // Required empty public constructor
    }

    public static FragmentResultsPage newInstance(String param1, String param2) {
        FragmentResultsPage fragment = new FragmentResultsPage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_results_page, container, false);
        Bundle bundle = this.getArguments();
        ArrayList<String> checkedValues = bundle.getStringArrayList("key");
        recyclerView = view.findViewById(R.id.my_recycle_view);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManagerWrapper(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        if (checkedValues.get(0) == "GameName")
        {
            FirebaseRecyclerOptions<DataModel> options =
                    new FirebaseRecyclerOptions.Builder<DataModel>()
                            .setQuery(FirebaseDatabase.getInstance().getReference().child("Games").orderByChild(checkedValues.get(0)).startAt(checkedValues.get(1)).endAt(checkedValues.get(1) + "\uf8ff"), DataModel.class)
                            .build();
            adapter = new CustomAdapter(options);
            if (adapter == null)
            {
                new AlertDialog.Builder(getContext())
                        .setTitle("Delete entry")
                        .setMessage("Are you sure you want to delete this entry?")

                        // Specifying a listener allows you to take an action before dismissing the dialog.
                        // The dialog is automatically dismissed when a dialog button is clicked.
                        .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                // Continue with delete operation
                            }
                        })

                        // A null listener allows the button to dismiss the dialog and take no further action.
                        .setNegativeButton(android.R.string.no, null)
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
            else{

                recyclerView.setAdapter(adapter);

            }

        }
        else
        {
            FirebaseRecyclerOptions<DataModel> options =
                    new FirebaseRecyclerOptions.Builder<DataModel>()
                            .setQuery(FirebaseDatabase.getInstance().getReference().child("Games").orderByChild(checkedValues.get(0)).equalTo(checkedValues.get(1)), DataModel.class)
                            .build();
            adapter = new CustomAdapter(options);
            recyclerView.setAdapter(adapter);

        }

        Button StartOverResultsButton = view.findViewById(R.id.StartOverSearchFromResults);
        StartOverResultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentSearchPage fragment = new FragmentSearchPage();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                //Navigation.findNavController(view).navigate(R.id.action_fragmentResultsPage_to_fragmentSearchPage);
            }
        });

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}