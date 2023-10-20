package com.example.recylerview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class VerticalAdapter extends RecyclerView.Adapter {
    int[] image;

    public VerticalAdapter(Context applicationContext, int[] images, String[] countryname) {
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
class MyViewHolder extends RecyclerView.ViewHolder{
   ImageView verticalimage;
   TextView verticaltext;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        verticalimage=itemView.findViewById(R.id.verticalimage);
        verticaltext=itemView.findViewById(R.id.verticaltext);
    }
}
