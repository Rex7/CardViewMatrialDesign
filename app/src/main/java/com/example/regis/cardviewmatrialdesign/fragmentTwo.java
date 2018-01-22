package com.example.regis.cardviewmatrialdesign;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class fragmentTwo extends Fragment {
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);

    }

    public void displayName(String name) {
        textView.setText("Name is " + name);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((FragmentManagerDemo) getActivity()).setTitleName("Fragment Two");
        textView = (TextView) view.findViewById(R.id.myName);


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);


    }


}
