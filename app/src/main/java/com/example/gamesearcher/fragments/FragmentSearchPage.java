package com.example.gamesearcher.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gamesearcher.MainActivity;
import com.example.gamesearcher.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentSearchPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentSearchPage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentSearchPage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentSearchPage.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentSearchPage newInstance(String param1, String param2) {
        FragmentSearchPage fragment = new FragmentSearchPage();
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

        View view = inflater.inflate(R.layout.fragment_search_page, container, false);

        Button LaunchYearButton = view.findViewById(R.id.LaunchYearButton);

        LaunchYearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentLaunchYear fragment = new FragmentLaunchYear();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                //Navigation.findNavController(view).navigate(R.id.action_fragmentSearchPage_to_fragmentLaunchYear);
            }
        });
        Button Platformbutton = view.findViewById(R.id.Platformbutton);

        Platformbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentPlatform fragment = new FragmentPlatform();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                //Navigation.findNavController(view).navigate(R.id.action_fragmentSearchPage_to_fragmentPlatform);
            }
        });
        Button GenreButton = view.findViewById(R.id.GenreButton);

        GenreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentGenre fragment = new FragmentGenre();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                //Navigation.findNavController(view).navigate(R.id.action_fragmentSearchPage_to_fragmentGenre);
            }
        });
        Button CompanyButton = view.findViewById(R.id.CompanyButton);

        CompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentCompany fragment = new FragmentCompany();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                //Navigation.findNavController(view).navigate(R.id.action_fragmentSearchPage_to_fragmentCompany);
            }
        });
        Button NameGameButton = view.findViewById(R.id.NameGameButton);

        NameGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentGameName fragment = new FragmentGameName();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                //Navigation.findNavController(view).navigate(R.id.action_fragmentSearchPage_to_fragmentGameName);
            }
        });

        return view;
    }
}