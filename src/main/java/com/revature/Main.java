package com.revature;

public class Main {
    public static void main(String[] args) {
        if(args.length > 0)
            System.out.println("Hello world! " + args[0]);
        else
            System.out.println("No args");
    }
}