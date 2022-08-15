package com.cydeo;

import jdk.swing.interop.SwingInterOpUtils;

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
    }
}
