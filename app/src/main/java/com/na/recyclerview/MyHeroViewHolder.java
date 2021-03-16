package com.na.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHeroViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView hero_name;
    TextView power;
    public MyHeroViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.tv_h_name);
        hero_name = itemView.findViewById(R.id.tv_hero_name);
        power = itemView.findViewById(R.id.tv_hero_power);
    }

    public void bind(Hero hero, ClickListener clickListener) {
        name.setText(hero.getName());
        hero_name.setText(hero.getHero_name());
        power.setText(hero.getPower());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.postClicked(hero);
            }
        });
    }
}
