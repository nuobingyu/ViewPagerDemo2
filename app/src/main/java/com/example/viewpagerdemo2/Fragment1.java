package com.example.viewpagerdemo2;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by 96274 on 2018/1/20.
 */

public class Fragment1 extends Fragment {

    private TextView one_text;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
         super.onCreate(savedInstanceState) ;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.one,container ,false );
         one_text = (TextView) view.findViewById(R.id.one);

        return view;
    }
}
