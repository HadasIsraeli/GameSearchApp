package com.example.gamesearcher.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gamesearcher.R;

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
        // Required empty public constructor
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

        SearchCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
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