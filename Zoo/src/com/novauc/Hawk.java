package com.novauc;

/**
 * Created by dangelojoyce on 2/14/17.
 */
public class Hawk extends Bird {

    public Hawk(){
        this.name = "Hawk";
    }

    @Override
    public void makeSound(){
        System.out.println("Caw!");
    }
}
