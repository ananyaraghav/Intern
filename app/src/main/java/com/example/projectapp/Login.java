package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText loginemail,loginpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view){
        loginemail=(EditText)findViewById(R.id.loginemail);
        loginpass=(EditText)findViewById(R.id.loginpassword);

        final String em = loginemail.getText().toString();
        final String pass = loginpass.getText().toString();
        final String valemail = loginemail.getText().toString().trim();
        final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (valemail.matches(emailPattern))
        {
        } else{
            loginemail.setError("Email is Invalid");
            loginemail.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(em)) {
            loginemail.setError("This field can't be empty");
            loginemail.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(pass) && pass.length() < 6) {
            loginpass.setError("This field can't be empty");
            loginpass.requestFocus();
            return;
        }

        Intent intent2 = new Intent(Login.this, Items.class);
        startActivity(intent2);
    }
}
