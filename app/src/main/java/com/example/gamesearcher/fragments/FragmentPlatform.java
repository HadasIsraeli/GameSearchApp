package com.example.gamesearcher.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.gamesearcher.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentPlatform#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentPlatform extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentPlatform() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentPlatform.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentPlatform newInstance(String param1, String param2) {
        FragmentPlatform fragment = new FragmentPlatform();
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
        View view = inflater.inflate(R.layout.fragment_platform, container, false);


        Button StartOverPlatformButton = view.findViewById(R.id.StartOverSearchFromPlatformButton);
        Button PSButton = view.findViewById(R.id.PSButton);
        Button XboxButton = view.findViewById(R.id.XboxButton);
        Button PCButton = view.findViewById(R.id.PCButton);
        Button NitendoButton = view.findViewById(R.id.NitendoButton);

        ArrayList<String> selectedPlatform = new ArrayList<>();
        selectedPlatform.add("Platform");

        PSButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedPlatform.add("PS");
                bundle.putStringArrayList("key", selectedPlatform);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        XboxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedPlatform.add("Xbox");
                bundle.putStringArrayList("key", selectedPlatform);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        PCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedPlatform.add("PC");
                bundle.putStringArrayList("key", selectedPlatform);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        NitendoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedPlatform.add("Nitendo");
                bundle.putStringArrayList("key", selectedPlatform);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });

        StartOverPlatformButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentSearchPage fragment = new FragmentSearchPage();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });

        return view;
    }
}