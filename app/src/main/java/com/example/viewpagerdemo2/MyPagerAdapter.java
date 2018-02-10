package com.example.viewpagerdemo2;

import android.content.Context;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by 96274 on 2018/1/20.
 */

public class MyPagerAdapter extends FragmentPagerAdapter{

    private Context context;

    public final int PAGE_COUNT = 3;

    private String tabTitles[] = {"标题1" ,"标题2" , "标题3"};

    MyPagerAdapter(FragmentManager fm, Context context){
        super(fm);
        this.context = context ;
    }

    @Override
    public Fragment getItem(int position) {
       switch(position)
       {
           case 0:
                return new Fragment1();
           case 1:
               return new Fragment2();
           case 2:
               return new Fragment3();
       }
       return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
         return tabTitles[position];
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
