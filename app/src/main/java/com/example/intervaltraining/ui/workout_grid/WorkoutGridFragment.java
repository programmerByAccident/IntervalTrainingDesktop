package com.example.intervaltraining.ui.workout_grid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.intervaltraining.R;
import com.example.intervaltraining.adapters.MyGridViewAdapter;

import java.util.ArrayList;

public class WorkoutGridFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        GridView workout_grid = root.findViewById(R.id.grid_view_map);
        ArrayList<String> elements = new ArrayList<>();
        elements.add("PLM");
        elements.add("Cacalau");


        final MyGridViewAdapter adapter = new MyGridViewAdapter(elements,getContext());

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                workout_grid.setClickable(true);
                workout_grid.setNumColumns(2);
                workout_grid.setAdapter(adapter);


            }
        });
        return root;
    }

    private void initialize(){



    }

    private void setAdapterToWorkoutGrid(){



        return;
    }

    private ArrayList<String> getElementsFromWorkoutDB(){

        ArrayList<String> elements = new ArrayList<>();

        return elements;
    }
}