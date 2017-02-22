package com.novauc;

/**
 * Created by dangelojoyce on 2/15/17.
 */
public class Person {

    String name;
    int age;
    Boolean isAlive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public Person() {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }
}
