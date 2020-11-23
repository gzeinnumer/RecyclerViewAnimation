package com.gzeinnumer.recyclerviewanimation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyHolder> {
    private static final String TAG = "DynamicAdapter";

    public ArrayList<String> list;

    public RVAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.bindData(list.get(position));

//        int anim = R.anim.anim_one;
//        int anim = R.anim.anim_two;
//        int anim = R.anim.anim_three;
//        int anim = R.anim.anim_simple_one;
//        int anim = R.anim.anim_simple_two;
//        int anim = R.anim.anim_simple_three;
        int anim = R.anim.anim_simple_fourth;

        holder.itemView.setAnimation(AnimationUtils.loadAnimation(holder.itemView.getContext(), anim));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

        public MyHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bindData(String data) {

        }
    }
}
