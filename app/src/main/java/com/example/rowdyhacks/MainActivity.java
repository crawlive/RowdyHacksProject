package com.example.rowdyhacks;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import java.util.ArrayList;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    //Button tvBtn;
    SwipeRefreshLayout swipeContainer;
    RecyclerView recyclerView;
    ArrayList<Contact> contacts;

    String[] dataset = {"Bethany Salazar","Aiden Johnson","Theresa Crawford","Joe Mama",
            "Caitlin Coronado"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, dataset);
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        //tvBtn = findViewById(R.id.tvBtn);
        //tvItem = findViewById(R.id.tvItem);
//        RecyclerView recyclerView =  findViewById(R.id.rvContacts);
//        contacts = Contact.createContactsList(20);
//        // Create adapter passing in the sample user data
//        RecyclerViewAdapter adapter = new RecyclerViewAdapter(contacts);
//        // Attach the adapter to the recyclerview to populate items
//        rvContacts.setAdapter(adapter);
//        // Set layout manager to position the items
//        rvContacts.setLayoutManager(new LinearLayoutManager(this));
//        //recyclerView = findViewById(R.id.recyclerView);
        //populateData();
        //setupAdapter();
        //recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
         //   @Override
          //  public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
           //     super.onScrolled(recyclerView, dx, dy);
                //LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
          //  }
        //});
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
