package com.example.regis.cardviewmatrialdesign;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class AppbarDemo extends AppCompatActivity implements messanger {

    FragmentManager fragmentManager;
    fragmentTwo fragmentTwo;
    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewPager;
    MyAdapter myAdapter;


    public void onCreate(Bundle saved) {
        super.onCreate(saved);
        setContentView(R.layout.appbardemo);
        toolbar = (Toolbar) findViewById(R.id.appbar);
        tablayout = (TabLayout) findViewById(R.id.tab);
        tablayout.addTab(tablayout.newTab().setText("Tab1"));
        tablayout.addTab(tablayout.newTab().setText("Tab2"));
        tablayout.addTab(tablayout.newTab().setText("Tab3"));

        setSupportActionBar(toolbar);
        myAdapter = new MyAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(myAdapter);
        tablayout.setupWithViewPager(viewPager);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menu_id = item.getItemId();

        switch (menu_id) {
            case R.id.search:
                Toast.makeText(getApplicationContext(), "Search button", Toast.LENGTH_LONG).show();
                break;
            case R.id.share:
                Toast.makeText(getApplicationContext(), "Share button", Toast.LENGTH_LONG).show();
                break;
            case R.id.setting:
                Toast.makeText(getApplicationContext(), "Setting button", Toast.LENGTH_LONG).show();
                break;


        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void sendData(String data) {
        fragmentManager = getSupportFragmentManager();
        String tag = "android:switcher:" + R.id.viewPager + ":" + 1;
        fragmentTwo = (fragmentTwo) fragmentManager.findFragmentByTag(tag);
        fragmentTwo.displayName(data);
    }
}

