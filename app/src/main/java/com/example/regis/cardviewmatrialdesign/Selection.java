package com.example.regis.cardviewmatrialdesign;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Selection extends AppCompatActivity  implements View.OnClickListener {
Button appbar,snackbar,fab,cardview,calculator,fragment;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        appbar=(Button)findViewById(R.id.appbar);
        fab=(Button)findViewById(R.id.fab);
        snackbar=(Button)findViewById(R.id.snacknar);
        cardview=(Button)findViewById(R.id.cardview);
        calculator=(Button)findViewById(R.id.calculator);
        fragment=(Button)findViewById(R.id.fragment) ;
        fragment.setOnClickListener(this);
        calculator.setOnClickListener(this);
        appbar.setOnClickListener(this);
        snackbar.setOnClickListener(this);
        cardview.setOnClickListener(this);
        fab.setOnClickListener(this);
        toolbar=(Toolbar)findViewById(R.id.appBar);
        setSupportActionBar(toolbar);


    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        Intent intent;
        switch (id){
            case R.id.appbar:
                intent=new Intent(this,AppbarDemo.class);
                startActivity(intent);
                break;
            case R.id.snacknar:
                intent=new Intent(this,SnackbarDemo.class);
                startActivity(intent);
                break;
            case R.id.fab:
                intent=new Intent(this, Fab.class);
                startActivity(intent);
                break;
            case R.id.cardview:
                intent=new Intent(this,MaterialDesign.class);
                startActivity(intent);
                break;
            case R.id.calculator:
                intent = new Intent(this,CalculatorDemo.class);
                startActivity(intent);
                break;
            case R.id.fragment:
                intent=new Intent(this,FragmentDemo.class);
                startActivity(intent);
                break;

        }
    }
}
