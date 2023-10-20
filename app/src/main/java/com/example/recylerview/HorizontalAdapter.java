package com.example.recylerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalAdapter extends RecyclerView.Adapter {
    public HorizontalAdapter(Context applicationContext, int[] images, String[] countryname) {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
class MYViewHolder extends RecyclerView.ViewHolder{
    ImageView horizontalimage;
    TextView horizontaltext;


    public MYViewHolder(@NonNull View itemView) {
        super(itemView);
        horizontalimage=itemView.findViewById(R.id.horizontal_only);
        horizontaltext=itemView.findViewById(R.id.horizontaltext);
    }
}
