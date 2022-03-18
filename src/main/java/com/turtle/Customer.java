package com.turtle;

public class Customer {
    String name;
    int spend;
    float off = 0.1f;
    public Customer(String name, int spend) {
        this.name = name;
        this.spend = spend;
    }
    public void print() {
        float offprice = (spend/1000)*off*1000;
        System.out.println(name + "\t" + spend +"\t" + (spend-offprice));

        }

    }

