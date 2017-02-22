package com.novauc;

/**
 * Created by dangelojoyce on 2/7/17.
 */
public class Person {
    String name;
    int age;
    boolean isAlive;

    String getName() {
        return name;
    }

    void setName(String name) { // (argument) pass to to method so that you can set the name variable of the class
        this.name = name;         //{parameter} is needed to set name; value is parameter

    }

    int getAge() {return age;}

    void setAge(int age) {

        if (age > 0 && age < 151) {
            this.age = age;
        } else {
            System.out.println("Not a valid age");
        }
    }
    boolean isAlive() {return isAlive;}

     void setIsAlive (boolean isAlive) {this.isAlive =isAlive;}

     boolean getIsAlive(){
        return this.isAlive; //"this" allows you to access the current line

     }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


}
