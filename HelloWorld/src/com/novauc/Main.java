package com.novauc;

public class Main {

    public static void main(String[] args) {
	// write your code here /*

        int score = 0;

        System.out.println("score is: " + score);

        score = score + 1;

        score += 1;

        System.out.println("score + 1 is: " + score);

        double health = 100;

        System.out.println("health is: " + health);

        health = health * 0.75;

        System.out.println("health is: " + health);

        // assigning didWin as boolean makes it viewed as boolean below

        boolean didWin = false;

        System.out.println("didWin: " + didWin);

        didWin = score > 0;

        System.out.println("didWin: " + didWin);

        //The way to store values of same type is an array; arrays begin with index 0

        double[] position = {1.0, 1.5};

        /*
        position = new double [2];

        position[0] = 1.0;

        position[1] = 1.5;
        */

        System.out.println("position[0]" + position [0]);
        System.out.println("position[1]" + position [1]);

        //A class also allows storing value of different types
        //a specific variable with that type is called an object

                    Person me = new Person();

                    me.name = "DAngelo";
                    me.age = 20;
                    me.isAlive = true;

                    Person president = new Person();

                    president.name = "Donald Trump";
                    president.setAge(200);
                    president.isAlive = true;


                    System.out.println("Presidents name is: " + president.name);
                    System.out.println("age is: " + president.age);
                    System.out.println("isAlive: " + president.name);
        // Either type can be print me. vs president.

                    me.setAge(25);
                    me.setIsAlive(false);

                    System.out.println("Me age: " +me.getName());
                    System.out.println("Me isAlive: " + me.getIsAlive()) ;





    }
}
