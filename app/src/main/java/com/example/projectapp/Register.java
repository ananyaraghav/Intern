package com.example.projectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText name,email,password,phone;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name=(EditText)findViewById(R.id.name);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        phone=(EditText)findViewById(R.id.phone);
        signup=(Button)findViewById(R.id.signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String em = email.getText().toString();
                final String pass = password.getText().toString();
                final String number = phone.getText().toString();
                final String valemail = email.getText().toString().trim();
                final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                final String numPattern = "^[+]?[0-9]{10,13}$";

                if (valemail.matches(emailPattern))
                {
                } else{
                    email.setError("Email is Invalid");
                    email.requestFocus();
                    return;
                }

                if (number.matches(numPattern))
                {
                } else{
                    phone.setError("Phone number is Invalid");
                    phone.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(em)) {
                    email.setError("This field can't be empty");
                    email.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(pass) && pass.length() < 6) {
                    password.setError("This field can't be empty");
                    password.requestFocus();
                    return;
                }

                if(TextUtils.isEmpty(number) || number.length()<10){
                    phone.setError("Valid number is required");
                    phone.requestFocus();
                    return;
                }
                Intent intent1 = new Intent(Register.this, Items.class);
                startActivity(intent1);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }
}