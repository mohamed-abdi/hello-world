package com.week1;

import static input.InputUtils.*;

/**
 * Input and output.
 */
public class Main {
    
    public static void main(String[] args) {
        
        /* Write your code here */
        
        String name = stringInput("Please enter your name?");
        System.out.println("Hello, " + name + "!");

        int student = intInput("how many students?");
        System.out.println("there are + student + ");
        double bookPrice = doubleInput("what is the price of the textbook?");

        double mms = doubleInput("how many m&ms are in a packet?");
        int people = intInput("how may people would like to share?");

        double mmsEach = mms/people;
        System.out.println("each person will get " + " m&ms each.");

    }
    
}
