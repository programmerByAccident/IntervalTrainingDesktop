package com.example.intervaltraining.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intervaltraining.R;

public class ExercicleHolderRecycleGrid extends RecyclerView.ViewHolder {

    private TextView title, content;

    public ExercicleHolderRecycleGrid(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title_grid_view_text);
        content = itemView.findViewById(R.id.content_grid_view_text);
    }

    public void setDetails(String textTitle){

        title.setText(textTitle);

    }
}
