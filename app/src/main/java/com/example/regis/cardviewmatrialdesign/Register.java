package com.example.regis.cardviewmatrialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText username, password;
    Button submit, button;
    DatabaseHelper helper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username = (EditText) findViewById(R.id.UserName);
        password = (EditText) findViewById(R.id.Password);
        submit = (Button) findViewById(R.id.register);
        button = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper = new DatabaseHelper(getApplicationContext(), null, null, 1);
                UserReg userReg = new UserReg();
                userReg.setUserName(username.getText().toString());
                userReg.setPassword(password.getText().toString());
                long val = helper.registerUser(userReg);
                if (val == 1) {
                    startActivity(new Intent(getApplicationContext(), LoginDemo.class));
                } else {
                    Toast.makeText(getApplicationContext(), "User not registered , try again", Toast.LENGTH_LONG).show();
                }

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helper.checUser("jenifer");
            }
        });


    }

}
