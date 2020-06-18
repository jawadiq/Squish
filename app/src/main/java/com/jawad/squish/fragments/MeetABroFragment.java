package com.jawad.squish.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.jawad.squish.R;

public class MeetABroFragment extends Fragment {
    public static  MeetABroFragment newInstance(){
        return new  MeetABroFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_meet_a_bro, container, false);
        return rootView;
    }
}
