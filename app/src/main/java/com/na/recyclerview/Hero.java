package com.na.recyclerview;

import java.io.Serializable;

public class Hero implements Serializable {
    String name;
    String hero_name;
    String power;

    public Hero(String name, String hero_name, String power) {
        this.name = name;
        this.hero_name = hero_name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHero_name() {
        return hero_name;
    }

    public void setHero_name(String hero_name) {
        this.hero_name = hero_name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
