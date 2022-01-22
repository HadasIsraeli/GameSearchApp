package com.example.gamesearcher.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gamesearcher.Game;
import com.example.gamesearcher.MainActivity;
import com.example.gamesearcher.R;
import com.example.gamesearcher.recyleviewgames.DataModel;
import com.example.gamesearcher.recyleviewgames.ResultPageActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentCompany#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentCompany extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentCompany() {

    }



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentCompany.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentCompany newInstance(String param1, String param2) {
        FragmentCompany fragment = new FragmentCompany();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_company, container, false);

        Button SearchCompanyButton = view.findViewById(R.id.SearchCompanyButton);
        Button StartOverCompanyButton = view.findViewById(R.id.StartOverSearchFromCompanyButton);
//        Button ActivisionCheckBox = view.findViewById(R.id.ActivisionCheckBox);
//        Button CPRCheckBox = view.findViewById(R.id.CPRCheckBox);
//        Button ForzaCheckBox = view.findViewById(R.id.ForzaCheckBox);
//        Button EACheckBox = view.findViewById(R.id.EACheckBox);
//        Button RockstarCheckBox = view.findViewById(R.id.RockstarCheckBox);
//        Button TwoKCheckBox = view.findViewById(R.id.TwoKCheckBox);
//        Button RiotCheckBox = view.findViewById(R.id.RiotCheckBox);

        SearchCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                // Need to be modified!!!!!!

//                FirebaseDatabase db = FirebaseDatabase.getInstance();
//                DatabaseReference myRef = db.getReference("Games");
//                Game game = new Game();
//                myRef.addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//                        for(DataSnapshot item_snapshot:snapshot.getChildren()){
//
//                            Game game = item_snapshot.getValue(Game.class);
//                            Toast.makeText(getActivity(),game.getCompany(),Toast.LENGTH_SHORT).show();
//
//                            if (game.getCompany() == "Activision") {
//
//                            }
//                        }
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//                    }
//                });
                Navigation.findNavController(view).navigate(R.id.action_fragmentCompany_to_fragmentResultsPage);
            }
        });

        StartOverCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Navigation.findNavController(view).navigate(R.id.action_fragmentCompany_to_fragmentSearchPage);
            }
        });

        return view;
    }
}