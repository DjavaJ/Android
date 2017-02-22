package com.novauc;

/**
 * Created by dangelojoyce on 2/14/17.
 */
public class Snake extends Reptile {

    public Snake(){
        this.name = "Snake";
    }

    @Override //@annotations allow for metadata for your Java code
    public void makeSound() {
        System.out.println("Hssss!");
    }
}
