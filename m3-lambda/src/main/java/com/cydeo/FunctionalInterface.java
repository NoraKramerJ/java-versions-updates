package com.cydeo;

import java.beans.Customizer;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>200;
            }
        };
//***********PREDICATE***********//

        Predicate<Integer> lesserThan=i ->i<18;
        System.out.println(lesserThan.test(20));


        System.out.println("**********Consumer*********");
        Consumer<Integer> display= i-> System.out.println();
        display.accept(10);


        System.out.println("***********BiConsumer*********");
        BiConsumer<Integer,Integer> addTwo=(x,y)-> System.out.println(x+y);
        addTwo.accept(1,2);
    }
}
