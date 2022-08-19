package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4);
       // list.forEach(x-> System.out.println(x));
        list.forEach(System.out::println);// another way


        System.out.println("_____Filter___________________");

        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);


        System.out.println("_________Distinct_______________");

        list.stream()
                .filter(i->i%2==0)
                .distinct()// remove duplicate
                .forEach(System.out::println);

        System.out.println("___________________Limit______________");
        list.stream()
                .filter(i->i%2==0)
                .limit(1)// return the first element that is left after the distinct
                .forEach(System.out::println);

        System.out.println("_____skip__________");
        list.stream()
                .filter(i->i%2==0)
                .skip(1)//skip always works for the first n numbers
                .forEach(System.out::println);

        System.out.println("______map_________");
        list.stream()
              //  .filter(i->i%2==0) >>>>one way>>>>
              //  .map(i->i*3)
               // .forEach(System.out::println);
                .map(number->number*2)// >>>>>another way>>>>
                .filter(i->i%3==0)
                .forEach(System.out::println);
    }
}
