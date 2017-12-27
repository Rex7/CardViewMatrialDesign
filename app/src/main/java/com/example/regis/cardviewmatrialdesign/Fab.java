package com.example.regis.cardviewmatrialdesign;

import android.graphics.Color;
import android.support.design.widget.*;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Fab extends AppCompatActivity {
    FloatingActionButton floatingActionButton;
   Snackbar snackbar;

    private View.OnClickListener snackBarListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        snackbar.dismiss();
        }
    } ;
  private View.OnClickListener fabListener =new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          snackbar=Snackbar.make(v,"hello is is a demo",Snackbar.LENGTH_LONG).
                  setAction("Dissmiss",snackBarListener);
          snackbar.setActionTextColor(Color.RED);
          View view=snackbar.getView();
          TextView textView=(TextView)view.findViewById(android.support.design.R.id.snackbar_text);
          textView.setTextColor(Color.CYAN);

          snackbar.show();
      }
  };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
        floatingActionButton=( FloatingActionButton)findViewById(R.id.fabButton);
        floatingActionButton.setOnClickListener(fabListener);
    }
}
