package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {


    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

     //   int sum = 0;
       // for(int number : numbers){
       //     sum = sum + number;
      //  }

        int result = numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println(result);
       Optional<Integer> result2= numbers.stream().reduce((a, b) -> a+b);
        System.out.println(result2.get());


        System.out.println("Dish calories total: ");
   //one way to do it using .get() with reduce

        int calTotal=  DishData.getAll().stream()
               .map(Dish::getCalories)
               .reduce((a,b)->a+b).get();
        System.out.println(calTotal);

        //another way using optional and no need to use get
        Optional<Integer> calTotal1=  DishData.getAll().stream()
                .map(Dish::getCalories)
               // .reduce((a,b)->a+b); one option
                       .reduce(Integer::sum);// another way
        System.out.println(calTotal1.get());


        System.out.println("MAX AND MIN WITH REDUCE METHOD");
        Optional<Integer> min=numbers.stream().reduce(Integer::min);
        Optional<Integer> max=numbers.stream().reduce(Integer::max);
        Optional<Integer> sum=numbers.stream().reduce(Integer::sum);

        System.out.println("Min:" + min.get());
        System.out.println("Max:" + max.get());
        System.out.println("Sum:" + sum.get());


        System.out.println("____________Count_______________");

        long DishCount=DishData.getAll().stream().count();
        System.out.println(DishCount);
    }
}
