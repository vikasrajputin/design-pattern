package com.designpattern.iterator;

public class Fruit {
    
    private String name;
    
    public Fruit(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
