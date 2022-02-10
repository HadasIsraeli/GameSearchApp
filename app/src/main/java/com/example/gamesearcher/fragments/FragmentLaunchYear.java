package com.example.gamesearcher.fragments;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.gamesearcher.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentLaunchYear#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentLaunchYear extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentLaunchYear() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentLaunchDate.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentLaunchYear newInstance(String param1, String param2) {
        FragmentLaunchYear fragment = new FragmentLaunchYear();
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
        View view = inflater.inflate(R.layout.fragment_launch_year, container, false);

        Button SearchLaunchYearButton = view.findViewById(R.id.SearchLaunchYearButton);
        Button StartOverLaunchYearButton = view.findViewById(R.id.StartOverSearchFromLaunchYearButton);

        EditText LaunchDateWindow = view.findViewById(R.id.editTextDate);

        ArrayList<String> LaunchDateList = new ArrayList<>();
        LaunchDateList.add("LaunchDate");

        SearchLaunchYearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Bundle bundle = new Bundle();
                if (LaunchDateWindow.getText().toString().length() != 4)
                {
                    new AlertDialog.Builder(getContext())
                            .setTitle("Invalid Input")
                            .setMessage("Enter the Input once again, this time enter a 4 digit year")

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
                else {
                    LaunchDateList.add(LaunchDateWindow.getText().toString());
                    bundle.putStringArrayList("key", LaunchDateList);

                    FragmentResultsPage fragment = new FragmentResultsPage();
                    fragment.setArguments(bundle);

                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView, fragment).commit();
                }
            }
        });

        StartOverLaunchYearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                FragmentSearchPage fragment = new FragmentSearchPage();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainerView,fragment).commit();
                //Navigation.findNavController(view).navigate(R.id.action_fragmentLaunchYear_to_fragmentSearchPage);
            }
        });
        return view;
    }
}