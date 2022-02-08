package com.example.gamesearcher.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gamesearcher.R;
import com.example.gamesearcher.recyleviewgames.CustomAdapter;
import com.example.gamesearcher.recyleviewgames.DataModel;
import com.example.gamesearcher.recyleviewgames.MyData;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

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

        recyclerView = view.findViewById(R.id.my_recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        FirebaseRecyclerOptions<DataModel> options =
                new FirebaseRecyclerOptions.Builder<DataModel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Games"), DataModel.class)
                        .build();

        adapter = new CustomAdapter(options);
        recyclerView.setAdapter(adapter);

        Button StartOverResultsButton = view.findViewById(R.id.StartOverSearchFromResults);
        StartOverResultsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Navigation.findNavController(view).navigate(R.id.action_fragmentResultsPage_to_fragmentSearchPage);
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

//public class FragmentResultsPage extends Fragment {
//
//    private ArrayList<DataModel> dataSet;
//    private RecyclerView recyclerView;
//    private LinearLayoutManager layoutManager;
//    private CustomAdapter addapter;
//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public FragmentResultsPage() {
//        // Required empty public constructor
//    }
//
//    // TODO: Rename and change types and number of parameters
//    public static FragmentResultsPage newInstance(String param1, String param2) {
//        FragmentResultsPage fragment = new FragmentResultsPage();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_results_page, container, false);
//
//        recyclerView=view.findViewById(R.id.my_recycle_view);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(linearLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        dataSet = new ArrayList<DataModel>();
//        for (int i = 0; i < MyData.nameArray.length; i++) {
//            dataSet.add(new DataModel(
//                    MyData.nameArray[i],
//                    MyData.versionArray[i],
//                    MyData.id_[i],
//                    MyData.drawableArray[i]
//            ));
//        }
//        addapter = new CustomAdapter(dataSet);
//        recyclerView.setAdapter(addapter);
//
//
//        Button StartOverResultsButton = view.findViewById(R.id.StartOverSearchFromResults);
//        StartOverResultsButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view1) {
//                Navigation.findNavController(view).navigate(R.id.action_fragmentResultsPage_to_fragmentSearchPage);
//            }
//        });
//
//        return view;
//    }
//}