package com.na.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Object> allTypeData;
    ClickListener clickListener;
    static int PERSON = 1;
    static int HERO = 2;

    public MyAdapter(ArrayList<Object> allTypeData, ClickListener clickListener) {
        this.allTypeData = allTypeData;
        this.clickListener = clickListener;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType == PERSON){
            return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_rec,parent,false));

        }else
        {
            return new MyHeroViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.row_hero,parent,false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(holder.getItemViewType() == PERSON){
            MyViewHolder myViewHolder = (MyViewHolder) holder;
            Person person =(Person) allTypeData.get(position);
            myViewHolder.bind(person,clickListener);

        }else
        {
            MyHeroViewHolder myHeroViewHolder = (MyHeroViewHolder) holder;
            Hero hero = (Hero) allTypeData.get(position);
            myHeroViewHolder.bind(hero,clickListener);

        }

    }

    @Override
    public int getItemViewType(int position) {
        if(allTypeData.get(position) instanceof Person){
            return PERSON;

        }else {
            return HERO;
        }
    }

    @Override
    public int getItemCount() {
        return allTypeData.size();
    }
}
