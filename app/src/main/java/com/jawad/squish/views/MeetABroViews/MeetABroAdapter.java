package com.jawad.squish.views.MeetABroViews;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.jawad.squish.R;
import com.jawad.squish.entities.Brother;

import java.util.ArrayList;

public class MeetABroAdapter extends RecyclerView.Adapter<MeetABroViewHolder> implements View.OnClickListener {
    private  LayoutInflater inflater;
    private AppCompatActivity activity;
    private  OnBrotherClickedListener listener;
    private  ArrayList<Brother> brothers;

    public MeetABroAdapter(AppCompatActivity activity, OnBrotherClickedListener listener) {
        this.activity = activity;
        this.listener = listener;
        brothers = new ArrayList<>();
        inflater = activity.getLayoutInflater();
    }

    public ArrayList<Brother> getBrothers() {
        return brothers;
    }

    @Override
    public void onClick(View view) {
        if(view.getTag() instanceof Brother){
            Brother brother = (Brother) view.getTag();
            listener.onBrotherClicked(brother);
        }

    }

    @NonNull
    @Override
    public MeetABroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_meet_a_bro,parent,false);
        view.setOnClickListener(this);
        return new MeetABroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MeetABroViewHolder holder, int position) {
        holder.populate(activity,brothers.get(position));
    }

    @Override
    public int getItemCount() {
        return  brothers.size();
    }

    public interface OnBrotherClickedListener{
        void onBrotherClicked(Brother brother);
    }
}
