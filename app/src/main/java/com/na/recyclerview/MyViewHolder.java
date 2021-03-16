package com.na.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView number;
    TextView address;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.tv_name);
        number = itemView.findViewById(R.id.tv_number);
        address = itemView.findViewById(R.id.tv_address);
    }

    public void bind(Person person, ClickListener clickListener) {
        name.setText(person.getName());
        number.setText(person.getNumber());
        address.setText(person.getAddress());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.postClicked(person);
            }
        });
    }
}
