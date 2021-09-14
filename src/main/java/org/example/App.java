package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        String uilength = sc.nextLine();
        System.out.println("What is the width of the room in feet?");
        String uiwidth = sc.nextLine();
        System.out.println("You entered dimensions of 15 feet by 20 feet.");
        Integer length = Integer.valueOf(uilength);
        Integer width = Integer.valueOf(uiwidth);
        float bucket = 350;
        float ftArea = length * width;
        double bucketsRequired = Math.ceil(ftArea / bucket);

        String conclusion = String.format("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", bucketsRequired, ftArea);

        System.out.println(conclusion);


    }
}