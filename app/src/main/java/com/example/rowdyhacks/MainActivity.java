package com.example.rowdyhacks;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    Button tvBtn;
    SwipeRefreshLayout swipeContainer;
    RecyclerView recyclerView;
    RecyclerViewAdapter recyclerViewAdapter;
    ArrayList<String> dataset = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvBtn = findViewById(R.id.tvBtn);
        recyclerView = findViewById(R.id.recyclerView);
        populateData();
        setupAdapter();
        /*swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Log.i(TAG, "fetching new data!");
                //populateItemRows();
            }
        });*/
    }

    /*private void goSignUpActivity() {
        Intent i = new Intent(this, TextMessage.class);
        startActivity(i);
        finish();
    }*/
    private void populateData(){
        int i = 0;
        while (i < 10){
            dataset.add("User: " + i);
            i++;
        }
    }
    private void setupAdapter(){
        recyclerViewAdapter = new RecyclerViewAdapter(dataset);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
    /*
        mHistory.add(null);
    private void populateItemRows (RecyclerViewAdapter.ItemViewHolder viewHolder, int position){
        String item = mHistory.get(position);
        viewHolder.tvItem.setText(item);
        //viewHolder.tvBtn.setText(item);
    }*/
}
