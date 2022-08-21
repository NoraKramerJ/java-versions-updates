package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    //All MATCH

    public static void main(String[] args) {
        System.out.println("All Match");
       boolean isHealthy=DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealthy);

        System.out.println("Any Match");// common usage
        if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");

            System.out.println("NONE MATCH");
            boolean isHealthy2=DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
            System.out.println(isHealthy2);


            System.out.println("Find Any");//findAny() picks only one of them that matches
            Optional<Dish> dish=DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
            //Optional is needed here to avoid a null.method if there is no match
            System.out.println(dish.get());// the right way to get it by adding get
            System.out.println(dish);// this will return the dish and print Optional with it

            System.out.println("Find First");// this will give the first dish that matches
            Optional<Dish> dish2=DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
            //Optional is needed here to avoid a null.method if there is no match
            System.out.println(dish.get());// the right way to get it by adding get
            System.out.println(dish);// this will return the dish and print Optional with it

            //PARALLEL STREAMS(Async)
            System.out.println(IntStream.range(0,100).parallel().findAny().getAsInt());
            System.out.println(IntStream.range(0,100).parallel().findFirst());
        }
    }
}
