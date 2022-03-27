package com.example.rowdyhacks;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends Activity{
    public static final String TAG = "SignupActivity";
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
        email = findViewById(R.id.email);
        passwd = findViewById(R.id.passwd);
        logIn = findViewById(R.id.logIn);

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
