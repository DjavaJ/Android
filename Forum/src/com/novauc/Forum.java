package com.novauc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by dangelojoyce on 2/16/17.
 */
public class Forum {

    public static void main(String[] args) throws FileNotFoundException {

        HashMap<String, ArrayList>Post = new HashMap<String, ArrayList>();
        ArrayList<Post> directory = new ArrayList<>();

        //read all post into our data structure

        File f = new File(".txt");
        Scanner fileScanner = new Scanner(f);



        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            String[] columns = line.split("\\|");

            Post post = new Post(Integer.valueOf(columns[0]), columns[1], columns[2]);

            directory.add(post);

        }

        Scanner consoleScanner = new Scanner(System.in);
        int replyId = -1;
        while (2 < 3) {
            //loop over posts and print posts with the right replyId
            int id = 0;

            for (Post post : directory) {

                if (post.replyId == replyId) {
                    System.out.printf("(%d) %s by %s\n", id, post.text, post.author);
                }

                id++;

            }

            //ask the user to type in a reply id
            System.out.println("Type the id you want to see replies to: ");
            replyId = Integer.valueOf(consoleScanner.nextLine());
        }
        }


}






