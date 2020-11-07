package com.example.intervaltraining.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.intervaltraining.R;

import java.util.List;

public class MyGridViewAdapter extends BaseAdapter {

    private Context context;
    private List<String> elements;
    private LayoutInflater layoutInflater;

    public MyGridViewAdapter(List<String> elements, Context context){
        this.context = context;
        this.elements = elements;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return this.elements.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){

            view = this.layoutInflater.inflate(R.layout.grid_view_element,viewGroup, false);

            TextView textView = view.findViewById(R.id.title_grid_view_text);

            textView.setText(elements.get(i));
        }

        return view;
    }
}
