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
import android.widget.Toast;

public class FragmentManagerDemo extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;
    FragmentManager fragmentManager;
    Fragment fragment;
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
                if (frameLayout != null) {
                    Toast.makeText(getApplicationContext(), "Iam in if of fragOne", Toast.LENGTH_LONG).show();
                    fragmentManager.beginTransaction()
                            .replace(R.id.myContainer, new fragmentOne())
                            .addToBackStack(null)
                            .commit();
                } else {
                    Toast.makeText(getApplicationContext(), "Iam in else of fragOne", Toast.LENGTH_LONG).show();
                    fragmentManager.beginTransaction()
                            .add(R.id.myContainer, new fragmentOne())
                            .addToBackStack(null)
                            .commit();
                }
                break;
            case R.id.fragTwo:
                if (frameLayout != null) {
                    Toast.makeText(getApplicationContext(), "Iam in if of fragTwo", Toast.LENGTH_LONG).show();
                    fragmentManager.beginTransaction()
                            .replace(R.id.myContainer, new fragmentTwo())
                            .addToBackStack(null)
                            .commit();
                } else {
                    Toast.makeText(getApplicationContext(), "Iam in if of fragTwo", Toast.LENGTH_LONG).show();
                    fragmentManager.beginTransaction()
                            .add(R.id.myContainer, new fragmentTwo())
                            .addToBackStack(null)
                            .commit();
                }
                break;
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}