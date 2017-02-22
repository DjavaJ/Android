package com.novauc;

/**
 * Created by dangelojoyce on 2/14/17.
 */
public class Animal { //extends class is inherent in the super class

    String name;

    public void makeSound(){
        System.out.println("Animal Sound");
    }

    @Override
    public String toString(){
        return name; //
    }
}
