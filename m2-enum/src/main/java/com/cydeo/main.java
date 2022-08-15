package com.cydeo;

import jdk.swing.interop.SwingInterOpUtils;

public class main {

    public static void main(String[] args) {

        System.out.println("How to access a constant?");

        Currency c=Currency.DIME;// this is already overridden toString enum
        System.out.println(c);
        switch(Currency.NICKLE){
            case DIME:
                System.out.println(" ten pennies");
                break;
            case PENNY:
                System.out.println("one penny");
                break;
            case NICKLE:
                System.out.println(" fifteen penny");
                break;
            case QUARTER:
                System.out.println("25 cents");
                break;

        }
    }
}
