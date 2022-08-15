package com.cydeo;

import static com.cydeo.Operation.*;

public class main {

    public static void main(String[] args) {

        System.out.println("How to access a constant?");

        Currency c=Currency.DIME;
        // to get one individual enum
        // this is already overridden toString method with enum
        System.out.println(c);
        System.out.println(Currency.QUARTER);
        System.out.println("how to get all constants");
        Currency[] currencies=Currency.values();
        // to get all constants, we can put it in an array format,
        // then iterate it



        for (Currency currency : currencies) {
            System.out.println(currency);
        }
        // we don't use new keyword here because it is enums
        Currency myCurrency = Currency.QUARTER;
        switch(myCurrency){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;



        }
        System.out.println("Operation task");
        calculate(10,20, PLUS);


        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());



    }
    private static void calculate(double x, double y,Operation operation){

        switch(operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }
}}
