package com.knoldus;
import java.util.*;

public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long number1 = sc.nextLong();
        long number2 = sc.nextLong();
        NumberRange numberRange = new NumberRange();
        long product = numberRange.getProductOfRange(number1, number2);
        System.out.println("Product is --"+ " " + product);
    }
}
