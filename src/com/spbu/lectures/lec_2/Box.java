package com.spbu.lectures.lec_2;


public class Box {
    public static String assign(String data){
        System.out.println("assigning " + data);
        return data;
    }

    String name = assign("box field");

    public Box(){

        assign("box contructor");
    }
}
