package com.example.gamesearcher.recyleviewgames;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.gamesearcher.MainActivity;
import com.example.gamesearcher.R;
import com.example.gamesearcher.fragments.FragmentResultsPage;

public class ResultPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fragment_results_page);

        FragmentResultsPage fragmentResultsPage = new FragmentResultsPage();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.resultsLayout,fragmentResultsPage);
        fragmentTransaction.commit();

        Intent intent = new Intent(ResultPageActivity.this, MainActivity.class);
        startActivity(intent);
    }
}















































