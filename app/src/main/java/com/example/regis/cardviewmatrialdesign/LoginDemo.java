package com.example.regis.cardviewmatrialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginDemo extends AppCompatActivity {
    Button register, Login;
    EditText user, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_demo);
        user = (EditText) findViewById(R.id.UserName);
        password = (EditText) findViewById(R.id.Password);
        Login = (Button) findViewById(R.id.LoginButton);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = user.getText().toString();
                String pass = password.getText().toString();
                DatabaseHelper databaseHelper = new DatabaseHelper(getApplicationContext(), null, null, 1);
                int val = databaseHelper.checUser(name);
                if (val == 0) {
                    Toast.makeText(getApplicationContext(), "Welcome user ", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Not user ", Toast.LENGTH_LONG).show();
                }

            }
        });
        register = (Button) findViewById(R.id.RegisterButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Register.class));
            }
        });
    }
}
