package com.novauc;

/**
 * Created by dangelojoyce on 2/14/17.
 */
public class Dog extends Mammal {

    public Dog(){
        this.name = "Dog";
    }

     //@annotations allow for metadata for your Java code
    @Override
    public void makeSound(){
        System.out.println("Woof!");

    }
}
