package com.example.gamesearcher.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gamesearcher.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentGameName#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentGameName extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public FragmentGameName() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentGameName.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentGameName newInstance(String param1, String param2) {
        FragmentGameName fragment = new FragmentGameName();
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
        View view = inflater.inflate(R.layout.fragment_game_name, container, false);

        Button searchNameButton = view.findViewById(R.id.searchNameButton);
        Button StartOverNameButton = view.findViewById(R.id.StartOverSearchFromNameButton);
        EditText gameNameWindow = view.findViewById(R.id.TextGameName);

        ArrayList<String> gameNameList = new ArrayList<>();
        gameNameList.add("GameName");

        searchNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Bundle bundle = new Bundle();
                gameNameList.add(gameNameWindow.getText().toString());
                bundle.putStringArrayList("key", gameNameList);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                //Navigation.findNavController(view).navigate(R.id.action_fragmentGameName_to_fragmentResultsPage);
            }
        });

        StartOverNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentSearchPage fragment = new FragmentSearchPage();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });

        return view;
    }
}