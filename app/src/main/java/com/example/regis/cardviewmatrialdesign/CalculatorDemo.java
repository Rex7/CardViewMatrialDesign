package com.example.regis.cardviewmatrialdesign;

import android.os.Build;
import android.os.Bundle;

import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalculatorDemo extends AppCompatActivity implements View.OnClickListener {
    EditText input ;
    Toolbar toolbar;
    TextView result;
    int no1=0;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnequal,btnadd,btnMinus,btnDiv,btnMul,btnClear;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override

    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mycalculator);
        input=(EditText)findViewById(R.id.inputAdd);
        input.setShowSoftInputOnFocus(false);
        input.setCursorVisible(false);
        result=(TextView)findViewById(R.id.ans);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnadd=(Button)findViewById(R.id.plus);
        btnequal=(Button)findViewById(R.id.equal);
        btnMinus=(Button)findViewById(R.id.btnMinus);
        btnDiv=(Button)findViewById(R.id.divButton);
        btnMul=(Button)findViewById(R.id.btnmul);
        btnClear=(Button)findViewById(R.id.clear);
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnequal.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        toolbar=(Toolbar)findViewById(R.id.appBar);
        setSupportActionBar(toolbar);

    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch(id){
            case R.id.btn0:

                input.setText(input.getText().toString()+""+btn0.getText().toString());
                break;
            case R.id.btn1:
                input.setText(input.getText().toString()+""+"1");
                break;
            case R.id.btn2:
                input.setText(input.getText().toString()+"2");
                break;
            case R.id.btn3:
                input.setText(input.getText().toString()+"3");
                break;
            case R.id.btn4:
                input.setText(input.getText().toString()+btn4.getText().toString());
                break;
            case R.id.btn5:
                input.setText(input.getText().toString()+btn5.getText().toString());
                break;
            case R.id.btn6:
                input.setText(input.getText().toString()+btn6.getText().toString());
                break;
            case R.id.btn7:
                input.setText(input.getText().toString()+btn7.getText().toString());
                break;
            case R.id.btn8:
                input.setText(input.getText().toString()+btn8.getText().toString());
                break;
            case R.id.btn9:
                input.setText(input.getText().toString()+btn9.getText().toString());
                break;
            case R.id.clear:
                input.setText("");
                break;
            case R.id.plus:

                   input.setText(input.getText().toString()+"+");


               break;



        }
    }
}
