package com.example.sikanted.slidingtabsapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


/*
    view pager is used to create sliding screens.
    different types of view pager - SimpleViewPager, ViewPagerWithFragments



 */


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = new ArrayList<String>();
        list.add("string 1");
        list.add("string 2");
        list.add("string 3");
        list.add("string 4");

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, list);

        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);
    }
}
