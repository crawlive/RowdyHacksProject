package com.example.rowdyhacks;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends Activity {
    public static final String TAG = "LoginActivity";
    private EditText userText;
    private EditText pwdText;
    private Button loginBtn;
    private Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        //if (userText != null) {
        //goMainActivity();
        //}
        signUp = findViewById(R.id.signUp);
        userText = findViewById(R.id.userText);
        pwdText = findViewById(R.id.pwdText);
        loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick login button");

                //String username = userText.getText().toString();
                //String password = pwdText.getText().toString();
                //prob need to parse the info maybe in the go method or here
                goMainActivity();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "onClick sign up button");
                goSignUpActivity();
            }
        });
    }

    private void goMainActivity() {
        Intent i = new Intent(this, MainActivity.class);
        //startActivity(i);
        startActivity(i, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        finish();
    }
    private void goSignUpActivity() {
        Intent i = new Intent(this, SignupActivity.class);
        startActivity(i);
        //startActivity(i, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
        finish();
    }
}
