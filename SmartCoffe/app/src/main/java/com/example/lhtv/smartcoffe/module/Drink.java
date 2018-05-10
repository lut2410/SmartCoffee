package com.example.lhtv.smartcoffe.module;

/**
 * Created by LHTV on 4/16/2018.
 */

public class Drink {
    public int id;
    public Double price;
    public String name;
    public int categoryId;
    public Drink(int id, int categoryId,Double price,String name){
        this.id = id;
        this.categoryId = categoryId;
        this.price = price;
        this.name = name;
    }
}
