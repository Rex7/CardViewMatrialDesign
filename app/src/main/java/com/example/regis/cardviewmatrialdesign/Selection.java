package com.example.regis.cardviewmatrialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Selection extends AppCompatActivity  implements View.OnClickListener {
Button appbar,snackbar,fab,cardview,calculator,fragment;
    String[] array, myName = {"regis", "charles", "anthony"};
    Spinner spinner;
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
        spinner = (Spinner) findViewById(R.id.selectSpinner);

        array = getResources().getStringArray(R.array.select);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, array);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        fragment.setOnClickListener(this);
        calculator.setOnClickListener(this);
        appbar.setOnClickListener(this);
        snackbar.setOnClickListener(this);
        cardview.setOnClickListener(this);
        fab.setOnClickListener(this);
        toolbar=(Toolbar)findViewById(R.id.appBar);
        setSupportActionBar(toolbar);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    startActivity(new Intent(getApplicationContext(), ListDemo.class));
                } else if (position == 2) {
                    startActivity(new Intent(getApplicationContext(), LoginDemo.class));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


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
