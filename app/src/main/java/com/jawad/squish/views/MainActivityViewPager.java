package com.jawad.squish.views;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.jawad.squish.fragments.AboutUsFragment;
import com.jawad.squish.fragments.MeetABroFragment;
import com.jawad.squish.fragments.RushFragment;

public class MainActivityViewPager extends FragmentStatePagerAdapter {

    public  MainActivityViewPager(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    public  MainActivityViewPager(FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment returnFragment;
        switch (position){
            case 0: returnFragment = AboutUsFragment.newInstance();
                break;
            case 1: returnFragment = MeetABroFragment.newInstance();
                break;
            case 2 : returnFragment = RushFragment.newInstance();
                break;
            default: return null;
        }
        return returnFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        CharSequence title;
        switch (position){
            case 0 : title ="News Feed";
                break;
            case 1: title = " News Feed";
                break;
            case 2 : title = "Meet Ups";
                break;
            default: return null;

        }
        return title;
    }
}