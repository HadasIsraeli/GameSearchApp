package com.example.gamesearcher.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gamesearcher.R;

import java.util.ArrayList;

public class FragmentCompany extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public FragmentCompany() {
    }

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

        Button StartOverCompanyButton = view.findViewById(R.id.StartOverSearchFromCompanyButton);
        Button ActivisionButton = view.findViewById(R.id.ActivisionButton);
        Button CPRButton = view.findViewById(R.id.CPRButton);
        Button ForzaButton = view.findViewById(R.id.ForzaButton);
        Button EAButton = view.findViewById(R.id.EAButton);
        Button RockstarButton = view.findViewById(R.id.RockstarButton);
        Button TwoKButton = view.findViewById(R.id.TwoKButton);
        Button RiotButton = view.findViewById(R.id.RiotButton);
        Button TelltaleGamesButton = view.findViewById(R.id.TelltaleGamesButton);

        ArrayList<String> checkedComapny = new ArrayList<>();
        checkedComapny.add("Company");
        ActivisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                checkedComapny.add("Activision");
                bundle.putStringArrayList("key", checkedComapny);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        CPRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                checkedComapny.add("CD Projekt RED");
                bundle.putStringArrayList("key", checkedComapny);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        ForzaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                checkedComapny.add("Forza Motorsport");
                bundle.putStringArrayList("key", checkedComapny);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        EAButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                checkedComapny.add("EA");
                bundle.putStringArrayList("key", checkedComapny);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        RockstarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                checkedComapny.add("Rockstar Games");
                bundle.putStringArrayList("key", checkedComapny);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        TwoKButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                checkedComapny.add("2K Sports");
                bundle.putStringArrayList("key", checkedComapny);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        RiotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                checkedComapny.add("RIOT Games");
                bundle.putStringArrayList("key", checkedComapny);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        TelltaleGamesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                checkedComapny.add("Telltale Games");
                bundle.putStringArrayList("key", checkedComapny);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });

        StartOverCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentSearchPage fragment = new FragmentSearchPage();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
            }
        });
        return view;
    }
}