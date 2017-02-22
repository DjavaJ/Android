package com.novauc;

import java.util.ArrayList;
import java.util.HashMap;

public class class2 {

    public static void main(String[] args) {

        String[] names = new String[6];

        names[0] = "Donald";
        names[1] = "Barack";
        names[2] = "George";
        names[3] = "Bill";
        names[4] = "George";
        names[5] = "Ronald";




        for (String name: names) {
            System.out.println(name);
        }

        /*int i = 0;
        while (i > 5) {
            System.out.println("Hello index, " +i);
            i++; */

         for (int i = 0; i < names.length; i++) {
             System.out.println(names[i]);
         }

         int myint = Integer.valueOf("123");
         System.out.println("my int : " + myint);

         double mydouble = Double.valueOf(".50");
         System.out.println("my double : " +mydouble);

         boolean myboolean = Boolean.valueOf("true");
         System.out.println("This is " +myboolean);

         Class test (d)

         ArrayList friends = new ArrayList();

         friends.add("Goku");
         friends.add("Vegeta");
         friends.add("Beerus");
         friends.add("Whis");

         System.out.println ("Friend fighting in the sky: " + friends.get (1));
         System.out.println ("Friend on the ground is watching: " + friends.get(0));

         for (Object buddies: friends) {
             System.out.println(buddies);
         }


             //friends.remove(3);

         HashMap <String, String> presidents = new HashMap ();
         presidents.put ("George" , "703-555-7777" );
         presidents.put ("Barack" , "800-345-7200" );
         presidents.put ("Donald" , "666-345-1984" );
         presidents.put ("Bill" , "210-324-7567" );

         String donaldsPhone = presidents.get("Donald");

         System.out.println("Donald's number is " +  donaldsPhone);




         }




        }










