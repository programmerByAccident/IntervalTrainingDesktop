package com.example.intervaltraining.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intervaltraining.R;
import com.example.intervaltraining.ViewHolders.ExercicleHolderRecycleGrid;
import com.example.intervaltraining.data_classes.ExerciceData;

import java.util.ArrayList;

public class GridRecyclerViewAdapter  extends RecyclerView .Adapter<ExercicleHolderRecycleGrid>{

    private ArrayList<String> exercices;
    private Context context;

    public GridRecyclerViewAdapter(Context context, ArrayList<String> exercices){

        this.context = context;
        this.exercices = exercices;
    }

    @NonNull
    @Override
    public ExercicleHolderRecycleGrid onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.grid_view_element, parent, false);
        return new ExercicleHolderRecycleGrid(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ExercicleHolderRecycleGrid holder, int position) {

        String titleText = exercices.get(position);

        holder.setDetails(titleText);

    }

    @Override
    public int getItemCount() {

       return  exercices.size();
    }

}
