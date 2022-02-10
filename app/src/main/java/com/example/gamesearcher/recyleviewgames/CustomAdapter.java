package com.example.gamesearcher.recyleviewgames;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.gamesearcher.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.ArrayList;


public class CustomAdapter extends FirebaseRecyclerAdapter<DataModel, CustomAdapter.MyViewHolder> {


    public CustomAdapter(@NonNull FirebaseRecyclerOptions<DataModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull DataModel model) {
        holder.textViewName.setText(model.getGameName());
        holder.textViewLaunchDate.setText(model.getLaunchDate());
        holder.textViewPlatform.setText(model.getPlatform());
        holder.textViewGenre.setText(model.getGenre());
        holder.textViewCompany.setText(model.getCompany());

        Glide.with(holder.imageViewGame.getContext()).load(model.getImage()).into(holder.imageViewGame);

        holder.trailerVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = model.getGameTrailer();
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                activity.startActivity(i);
            }
        });

        holder.imageButtonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = model.getWebSite();
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                activity.startActivity(i);
            }
        });
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_game_view, parent, false);
        return new MyViewHolder(view);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName, textViewCompany, textViewGenre, textViewPlatform, textViewLaunchDate;
        ImageView imageViewGame;
        ImageButton trailerVideoButton;
        ImageButton imageButtonWeb;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            textViewLaunchDate = (TextView) itemView.findViewById(R.id.textViewLaunchDate);
            textViewPlatform = (TextView) itemView.findViewById(R.id.textViewPlatform);
            textViewGenre = (TextView) itemView.findViewById(R.id.textViewGenre);
            textViewCompany = (TextView) itemView.findViewById(R.id.textViewCompany);
            trailerVideoButton = (ImageButton) itemView.findViewById(R.id.trailerVideoButton);
            imageViewGame = (ImageView) itemView.findViewById(R.id.imageViewGame);
            imageButtonWeb = (ImageButton) itemView.findViewById(R.id.imageButtonWeb);
        }
    }
}



