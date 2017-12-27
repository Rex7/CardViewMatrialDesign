package com.example.regis.cardviewmatrialdesign;

import android.os.Bundle;


import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class FragmentDemo extends AppCompatActivity implements messanger {
FragmentManager fragmentManager;
    fragmentTwo fragmentTwo;
    ViewPager viewPager;
    MyAdapter myAdapter;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myactivity);





    }

    @Override
    public void sendData(String data) {
        fragmentManager=getSupportFragmentManager();
        fragmentTwo = (com.example.regis.cardviewmatrialdesign.fragmentTwo) fragmentManager.findFragmentById(R.id.fragment2);
        fragmentTwo.displayName( data);

    }
}

