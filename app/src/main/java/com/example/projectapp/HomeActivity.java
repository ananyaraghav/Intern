package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void login(View view){
        Intent i = new Intent(HomeActivity.this, Login.class);
        startActivity(i);
    }
    public void signup(View view){
        Intent intent = new Intent(HomeActivity.this, Register.class);
        startActivity(intent);
    }
}
