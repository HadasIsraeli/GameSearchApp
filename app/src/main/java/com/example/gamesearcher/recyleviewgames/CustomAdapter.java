package com.example.gamesearcher.recyleviewgames;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        Glide.with(holder.imageViewGame.getContext()).load(model.getImage()).into(holder.imageViewGame);

//        holder.imageViewGame.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AppCompatActivity activity = (AppCompatActivity) view.getContext();
//                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper)
//            }
//        });
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_game_view, parent, false);
        return new MyViewHolder(view);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView textViewName;
        ImageView imageViewGame;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.card_view);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            imageViewGame = (ImageView) itemView.findViewById(R.id.imageViewGame);
        }
    }

}

//public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>  {
//
//    private ArrayList<DataModel> dataSet;
//
//    public CustomAdapter(ArrayList<DataModel> dataSet) {
//
//        this.dataSet = dataSet;
//    }
//
//    public static class MyViewHolder extends RecyclerView.ViewHolder  {
//       CardView cardView;
//       TextView textViewName;
//       TextView textViewVersion;
//        ImageView imageViewIcon;
//
//       public MyViewHolder (View itemView )
//       {
//           super(itemView);
//
//           cardView = (CardView) itemView.findViewById(R.id.card_view);
//           textViewName = ( TextView) itemView.findViewById(R.id.textViewName);
//           textViewVersion = ( TextView) itemView.findViewById(R.id.textViewVersion);
//           imageViewIcon = (ImageView) itemView.findViewById(R.id.imageButton);
//
//       }
//
//    }
//
//    @NonNull
//    @Override
//    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
//
//        View view = LayoutInflater.from(parent.getContext() ).inflate(R.layout.my_game_view , parent ,false);
//
//        MyViewHolder myViewHolder = new MyViewHolder(view);
//
//        return myViewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull MyViewHolder viewHolder,  int listPosition) {
//
//        TextView textViewName = viewHolder.textViewName;
//        TextView textViewVersion = viewHolder.textViewVersion;
//        ImageView imageView = viewHolder.imageViewIcon;
//        CardView cardView = viewHolder.cardView;
//
//        textViewName.setText(dataSet.get(listPosition).getName());
//        textViewVersion.setText(dataSet.get(listPosition).getVersion());
//        imageView.setImageResource(dataSet.get(listPosition).getImage());
//
//
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return dataSet.size();
//    }
//}


