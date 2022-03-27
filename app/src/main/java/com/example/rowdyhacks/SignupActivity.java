package com.example.rowdyhacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SignupActivity extends Activity{
    public static final String TAG = "SignupActivity";
    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText passwd;
    private Button logIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        //if (email != null) {
        //    goMainActivity();
        //}
        firstName = findViewById(R.id.firstname);
        lastName = findViewById(R.id.lastname);
        email = findViewById(R.id.email);
        passwd = findViewById(R.id.passwd);
        logIn = findViewById(R.id.logIn);

        Spinner knownLanguage=findViewById(R.id.knownlang);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        knownLanguage.setAdapter(adapter);

        Spinner learnLanguage=findViewById(R.id.learnlang);
        ArrayAdapter<CharSequence>adapter2=ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item);
        learnLanguage.setAdapter(adapter2);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick login button");
                String username = email.getText().toString();
                String password = passwd.getText().toString();
                //prob need to parse the info maybe in the go method or here
                //if the email and the passwd is not in the DB go to MainActivity
                //goMainActivity();
                //else print "the user already exists"
            }
        });
    }

    private void goMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }

}
