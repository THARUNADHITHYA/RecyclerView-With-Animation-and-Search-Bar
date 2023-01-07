package com.example.recyclerviewanimated;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewHolder> {

    Context context;
    List<ReviewItem> mData;

    public ReviewAdapter(Context context, List<ReviewItem> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ReviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View Layout;
        Layout = LayoutInflater.from(context).inflate(R.layout.item_review,parent,false);
        return new ReviewHolder(Layout);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewHolder holder, int position) {

        holder.user_img.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_transistion));
        holder.container.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_scale));


        holder.tv_title.setText(mData.get(position).getTitle());
        holder.tv_desc.setText(mData.get(position).getContent());
        holder.tv_date.setText(mData.get(position).getDate());
        holder.user_img.setImageResource(mData.get(position).getUserImg());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void filteredList(ArrayList<ReviewItem> filteredList) {

        mData = filteredList;
        notifyDataSetChanged();

    }

    public class ReviewHolder extends RecyclerView.ViewHolder
    {
        ConstraintLayout container;
        TextView tv_title,tv_desc,tv_date;
        ImageView user_img;

        public ReviewHolder(@NonNull View itemView) {
            super(itemView);

            container = itemView.findViewById(R.id.container);
            tv_title = itemView.findViewById(R.id.tv_title);
            tv_desc = itemView.findViewById(R.id.tv_description);
            tv_date = itemView.findViewById(R.id.tv_date);
            user_img = itemView.findViewById(R.id.img_user);



        }
    }

}
