package com.na.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ClickListener {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        createData();
    }

    private void createData() {
        ArrayList<Object> allTypeData = new ArrayList<>();
        allTypeData.add(new Person("Akshay Sharma","9617152843","Raipur"));
        allTypeData.add(new Hero("Tony Stark","Iron Man","Armor,Mind"));
        allTypeData.add(new Person("Ayush Shrivastava","9876543210","Raipur"));
        allTypeData.add(new Hero("Bruce Benner","Hulk","Gama Rays"));
        allTypeData.add(new Person("Abhishek Sharma","8314064013","Bhilai"));
        allTypeData.add(new Hero("Thor OrdinSon","Thor","Thunder"));
        allTypeData.add(new Person("Tushar Shwarnakar","3456789021","Bhilai"));
        allTypeData.add(new Hero("Steve Rogers","Captain America","Syrum"));
        allTypeData.add(new Person("Parijat Chaturvedi","7890654321","Raipur"));
        allTypeData.add(new Hero("Wade Wilson","DeadPool","Immortal"));
        allTypeData.add(new Person("Devendra Meshram","6789054321","Raipur"));
        allTypeData.add(new Hero("Logan","X-Man","Wolvorine"));
        allTypeData.add(new Person("Ayush Sharma","7697528285","Dhamtari"));
        drawRecycler(allTypeData);

    }

    private void drawRecycler(ArrayList<Object> model) {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(model,this));
    }


    private void initView() {
        recyclerView = findViewById(R.id.rec_one);

    }

    @Override
    public void postClicked(Object object) {
        if(object instanceof Hero){
             Hero heroObj = (Hero) object;
             Intent intent = new Intent(MainActivity.this, UserDetails.class);
             intent.putExtra(ObjectNamingUtils.HERO_OBJ, heroObj);
             startActivity(intent);

        }
        else
        {
                Person personObj = (Person) object;
                Intent intent = new Intent(MainActivity.this, UserDetails.class);
                             intent.putExtra(ObjectNamingUtils.PERSON_OBJ, personObj);
                             startActivity(intent);

        }
    }
}