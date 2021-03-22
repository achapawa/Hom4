package edu.isu.cs2263.hom4;

import java.util.LinkedList;

public class User{
    private String userName;
    public LinkedList<Relationship> relnList;

    public User(String UserName){
        this.userName = UserName;
        relnList = new LinkedList<>();
    }

    public String getName(){
        return userName;
    }

    public LinkedList<Relationship> getRelnList(){
        return relnList;
    }
}
