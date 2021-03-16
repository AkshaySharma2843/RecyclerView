package com.na.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class UserDetails extends AppCompatActivity {
    TextView details_name;
    TextView details_number;
    TextView details_address;
    String name;
    String number;
    String address;
    Hero heroObj;
    Person personObj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        heroObj = (Hero)getIntent().getSerializableExtra(ObjectNamingUtils.HERO_OBJ);
        personObj = (Person) getIntent().getSerializableExtra(ObjectNamingUtils.PERSON_OBJ);


    /*    name = getIntent().getExtras().getString("NAME");
        number = getIntent().getExtras().getString("NUMBER");
        address = getIntent().getExtras().getString("ADDRESS");*/
        initView();
        setData();
    }

    private void setData() {
      if(heroObj!=null){
          details_name.setText(heroObj.getName());
          details_number.setText(heroObj.getHero_name());
          details_address.setText(heroObj.getPower());
      }
      else{
          details_name.setText(personObj.getName());
          details_number.setText(personObj.getNumber());
          details_address.setText(personObj.getAddress());

      }
    }

    private void initView() {
        details_name = findViewById(R.id.tv_details_name);
        details_number = findViewById(R.id.tv_details_number);
        details_address = findViewById(R.id.tv_details_address);
    }
}