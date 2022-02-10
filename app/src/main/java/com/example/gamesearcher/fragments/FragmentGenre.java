package com.example.gamesearcher.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.gamesearcher.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentGenre#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentGenre extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentGenre() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentGenre.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentGenre newInstance(String param1, String param2) {
        FragmentGenre fragment = new FragmentGenre();
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
        View view = inflater.inflate(R.layout.fragment_genre, container, false);


        Button StartOverGenreButton = view.findViewById(R.id.StartOverSearchFromGenreButton);

        Button ActionButton = view.findViewById(R.id.ActionButton);
        Button SportsButton = view.findViewById(R.id.SportsButton);
        Button AdventureButton = view.findViewById(R.id.AdventureButton);
        Button RoleplayingButton = view.findViewById(R.id.RoleplayingButton);
        Button BattleRoyaleButton = view.findViewById(R.id.BattleRoyaleButton);
        Button FirstPersonShooterButton = view.findViewById(R.id.FirstPersonShooterButton);
        Button RacingButton = view.findViewById(R.id.RacingButton);
        Button FantasyButton = view.findViewById(R.id.FantasyButton);

        ArrayList<String> selectedGenre = new ArrayList<>();
        selectedGenre.add("Genre");
        ActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedGenre.add("Action");
                bundle.putStringArrayList("key", selectedGenre);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        SportsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedGenre.add("Sports");
                bundle.putStringArrayList("key", selectedGenre);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        AdventureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedGenre.add("Adventure");
                bundle.putStringArrayList("key", selectedGenre);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        RoleplayingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedGenre.add("Roleplaying");
                bundle.putStringArrayList("key", selectedGenre);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        BattleRoyaleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedGenre.add("Battle royale");
                bundle.putStringArrayList("key", selectedGenre);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        FirstPersonShooterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedGenre.add("First person hero shooter");
                bundle.putStringArrayList("key", selectedGenre);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        RacingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedGenre.add("Racing");
                bundle.putStringArrayList("key", selectedGenre);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });
        FantasyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                selectedGenre.add("Fantasy");
                bundle.putStringArrayList("key", selectedGenre);

                FragmentResultsPage fragment = new FragmentResultsPage();
                fragment.setArguments(bundle);

                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
            }
        });


        StartOverGenreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentSearchPage fragment = new FragmentSearchPage();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                //Navigation.findNavController(view).navigate(R.id.action_fragmentGenre_to_fragmentSearchPage);
            }
        });
        return view;
    }
}