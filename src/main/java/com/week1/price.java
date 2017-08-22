package com.week1;

/**
 * Created by bm2256il on 8/22/2017.
 */

import static input.InputUtils.*;
public class price {

    public static void main(String[] args) {

      String productName = stringInput("what is the name of the product?");
        double price = doubleInput("what does productName " + " to sell? ");
        int quantity = intInput("how many" + productName+ "to sell?");

        //calculation of cost
        double totalPrice = price * quantity;

        System.out.println(quantity + "of" + productName+ "at $" +price+ " each costs $" + totalPrice);


    }
}
