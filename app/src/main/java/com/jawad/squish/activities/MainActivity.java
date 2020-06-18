package com.jawad.squish.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.jawad.squish.R;
import com.jawad.squish.views.MainActivityViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//    ViewPager viewPager;
//    TabLayout tabLayout;
@BindView(R.id.main_pager)ViewPager viewPager;
@BindView(R.id.tab_pager) TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        viewPager = findViewById(R.id.main_pager);
//        tabLayout = findViewById(R.id.tab_pager);
        MainActivityViewPager adapter = new MainActivityViewPager(getSupportFragmentManager());
        ButterKnife.bind(this);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}