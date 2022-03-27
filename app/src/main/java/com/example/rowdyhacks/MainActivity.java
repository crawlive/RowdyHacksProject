package com.example.rowdyhacks;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    //Button tvBtn;
//    SwipeRefreshLayout swipeContainer;
    RecyclerView recyclerView;
    ArrayList<Contact> contacts;

    String[] dataset = {"Bethany Salazar","Aiden Johnson","Theresa Crawford","Will Smith", "Doc Rob"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, dataset);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
//        listView.getSelectedItem();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int index = i;
                Toast.makeText(MainActivity.this, "Selected Person " + dataset[index], Toast.LENGTH_LONG).show();

            }
        });
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
    }
    private void populateData(){
        int i = 0;
        while (i < 10){
            dataset.add("User: " + i);
            i++;
        }
        dataset.add(null);
    }
    private void setupAdapter(){
        recyclerViewAdapter = new RecyclerViewAdapter(dataset);
        recyclerView.setAdapter(recyclerViewAdapter);
    }*/
    /*
        mHistory.add(null);
    private void populateItemRows (RecyclerViewAdapter.ItemViewHolder viewHolder, int position){
        String item = mHistory.get(position);
        viewHolder.tvItem.setText(item);
        //viewHolder.tvBtn.setText(item);
    }*/
}
