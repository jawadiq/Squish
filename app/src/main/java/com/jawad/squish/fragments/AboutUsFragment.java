package com.jawad.squish.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.jawad.squish.R;

public class AboutUsFragment extends Fragment {
    public static AboutUsFragment newInstance(){
        return new AboutUsFragment();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_about_us, container, false);
        return rootView;
    }
}
