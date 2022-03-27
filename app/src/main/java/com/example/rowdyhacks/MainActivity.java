package com.example.rowdyhacks;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    Button tvBtn;
    SwipeRefreshLayout swipeContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvBtn = findViewById(R.id.tvBtn);

        swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Log.i(TAG, "fetching new data!");
                //populateItemRows();
            }
        });
    }

    /*private void goSignUpActivity() {
        Intent i = new Intent(this, TextMessage.class);
        startActivity(i);
        finish();
    }
    int i = 0;
        while (i < 10){
            mHistory.add("User: " + i);
            i++;
        }
        mHistory.add(null);
    private void populateItemRows (RecyclerViewAdapter.ItemViewHolder viewHolder, int position){
        String item = mHistory.get(position);
        viewHolder.tvItem.setText(item);
        //viewHolder.tvBtn.setText(item);
    }*/
}
