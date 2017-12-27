package com.example.regis.cardviewmatrialdesign;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class fragmentOne extends Fragment {
private EditText enterName;
  private   Button submit;
    private  messanger message;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        enterName=(EditText)view.findViewById(R.id.enterName);
        submit=(Button)view.findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=enterName.getText().toString().trim();
                 message.sendData(name);
            }
        });

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            message=(messanger) context;
        }
        catch(ClassCastException cl){

        }
    }
}
