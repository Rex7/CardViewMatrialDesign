package com.example.regis.cardviewmatrialdesign;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class MyAdapter extends FragmentPagerAdapter {

    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
   if(position==0){
       fragment=new fragmentOne();
       return  fragment;
   }
   else {
       fragment=new fragmentTwo();
       return fragment;
   }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
         return    new String("Comedy");
        }
        else  if (position==1){
            return new String("movies");
        }
        return new String("");
    }
}
