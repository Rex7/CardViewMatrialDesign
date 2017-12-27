package com.example.regis.cardviewmatrialdesign;

import android.os.Bundle;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;


public class FragmentDemo extends AppCompatActivity implements messanger {
FragmentManager fragmentManager;
    fragmentTwo fragmentTwo;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myactivity);



    }

    @Override
    public void sendData(String data) {
        fragmentManager=getFragmentManager();
        fragmentTwo = (com.example.regis.cardviewmatrialdesign.fragmentTwo) fragmentManager.findFragmentById(R.id.fragment2);
        fragmentTwo.displayName( data);

    }
}

