package com.jawad.squish.views.MeetABroViews;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jawad.squish.R;
import com.jawad.squish.entities.Brother;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MeetABroViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.list_meet_a_bro_image)
    ImageView brotherImage;
    @BindView(R.id.list_meet_a_bro_progressBar)
    ProgressBar brotherProgressBar;
    public MeetABroViewHolder(@NonNull View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
    public void populate(Context context, Brother brother) {
        itemView.setTag(brother);

        Picasso.with(context).load(brother.getBrotherPicture())
                .fit()
                .centerCrop()
                .into(brotherImage, new Callback() {
                    @Override
                    public void onSuccess() {brotherProgressBar.setVisibility(View.GONE);
                    }

                    @Override
                    public void onError() {

                    }
                });
    }
}
