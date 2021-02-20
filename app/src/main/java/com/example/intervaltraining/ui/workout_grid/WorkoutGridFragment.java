package com.example.intervaltraining.ui.workout_grid;

import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.intervaltraining.R;
import com.example.intervaltraining.adapters.GridRecyclerViewAdapter;

import org.jetbrains.annotations.Contract;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WorkoutGridFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView workout_grid;
    private GridRecyclerViewAdapter gridRecyclerViewAdapter;
    private ArrayList<String> elements;
    private DisplayMetrics displayObject;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        initializeViews(root);
        playWithScreenSize();

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });
        return root;
    }

    private void initializeViews(View root){
        workout_grid = (RecyclerView) root.findViewById(R.id.grid_view_map);
        workout_grid.setLayoutManager(new GridLayoutManager(getContext(), 2));
        workout_grid.setHasFixedSize(false);
        workout_grid.setClickable(true);



        elements = new ArrayList<>();
        elements.add("PLM");
        elements.add("Cacalau");

        gridRecyclerViewAdapter = new GridRecyclerViewAdapter(getContext(), elements);
        workout_grid.setAdapter(gridRecyclerViewAdapter);
    }

    private void playWithScreenSize(){

        int height = getResources().getDisplayMetrics().heightPixels;
        int width = getResources().getDisplayMetrics().widthPixels;

    }

    private int getNavigationBarHeight(){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1){

            DisplayMetrics metrics = new DisplayMetrics();

        }

        return 0;

    }



}