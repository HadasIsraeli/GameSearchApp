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

public class FragmentPlatform extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public FragmentPlatform() {
    }

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

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
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

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
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

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
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

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        StartOverPlatformButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentSearchPage fragment = new FragmentSearchPage();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        return view;
    }
}