package com.example.regis.cardviewmatrialdesign;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class FragmentManagerDemo extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    FragmentManager fragmentManager;
    Fragment fragment = null;
    FrameLayout frameLayout;
    DrawerLayout drwaerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_manager_demo);
        frameLayout = (FrameLayout) findViewById(R.id.myContainer);
        nav = (NavigationView) findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(this);
        toolbar = (Toolbar) findViewById(R.id.bar);
        fragmentManager = getSupportFragmentManager();
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hello world");
        drwaerLayout = (DrawerLayout) findViewById(R.id.drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drwaerLayout, toolbar,
                R.string.open, R.string.close);
        drwaerLayout.addDrawerListener(actionBarDrawerToggle);
    }

    public void setTitleName(String Title) {
        getSupportActionBar().setTitle(Title);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.fragOne:
                fragment = new fragmentOne();
                break;
            case R.id.fragTwo:
                fragment = new fragmentTwo();
                break;

        }
        if (fragment != null) {
            fragmentManager.beginTransaction()
                    .replace(R.id.myContainer, fragment)
                    .addToBackStack(null)
                    .commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}