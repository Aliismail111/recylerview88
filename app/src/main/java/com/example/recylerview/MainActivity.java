package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    int images[]={
            R.drawable.afghanistan,
            R.drawable.bhutan,
            R.drawable.china,
            R.drawable.iran,
            R.drawable.nepal,
            R.drawable.saudiarabia,
            R.drawable.srilanka,
            R.drawable.uae,
            R.drawable.turkey,
            R.drawable.pakistan
    };
    String countryname[]={
            "afghanistan","bhutan","china","iran","nepal","saudiarabia","srilanka","uae","turkey","pakistan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerhorizontal=(RecyclerView) findViewById(R.id.rv_horizantal);
        RecyclerView recyclervertical=(RecyclerView) findViewById(R.id.rv_vertical);

        LinearLayoutManager horizontallayoutManager=new LinearLayoutManager(this);
        recyclerhorizontal.setLayoutManager(horizontallayoutManager);
        HorizontalAdapter horizontaladapter=new HorizontalAdapter(getApplicationContext(),images,countryname);
        recyclerhorizontal.setAdapter(horizontaladapter);

        LinearLayoutManager verticallayoutManager=new LinearLayoutManager(this);
        recyclervertical.setLayoutManager(verticallayoutManager);
        VerticalAdapter verticaladapter=new VerticalAdapter(getApplicationContext(),images,countryname);
        recyclervertical.setAdapter(verticaladapter);

    }
}