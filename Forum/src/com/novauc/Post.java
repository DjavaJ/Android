package com.novauc;

/**
 * Created by dangelojoyce on 2/16/17.
 */
public class Post {

    int replyId;
    String author;
    String text;

    public Post(int replyid, String author, String text){
        this.replyId = replyid;
        this.author = author;
        this.text = text;

    }

}
