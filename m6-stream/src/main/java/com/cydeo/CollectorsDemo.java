package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {


        System.out.println("toCollection(Supplier: is used to create a collection using collector");

        List<Integer> numbers= Arrays.asList(3,4,5,6,6,7);
List<Integer> numberList= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        Set<Integer> numberSet=numbers.stream()// set doesn't allow duplicate
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);


        System.out.println("toList() : return a Collector interface that gathers the input data into a new list");
        // the method toList is the most used one


      List<Integer> numberList2= numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println("toSet() : returns a Collector interface that gathers the input data into a new set");
        Set<Integer> numberSet2=numbers.stream()// set doesn't allow duplicate
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println("toMap(Function,Function) : return a Collector interface that gathers the input data into a new map");
       Map<String,Integer> dishMap= DishData.getAll()
                .stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);


        System.out.println("summingInt(ToIntFunction) : returns a Collector that produces the sum of an Integer-valued func");
       Integer sum= DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);


        System.out.println("counting() : returns a Collector that counts the number of the elements");
        long evenCount=numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);

        System.out.println("averagingInt(ToIntFunction : returns the average of the integers passed values");
Double caloriesAvg=DishData.getAll().stream()
        .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(caloriesAvg);

        System.out.println("joining() : is used to join various elements of a character or string array into a single object");
        List<String> courses=Arrays.asList("java","JS","TS");
        String str= courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);


        System.out.println("partitioningBy(): is used to partition a stream of objects(or a set of elements)based on a given predicate");
       Map<Boolean,List<Dish>> veggieDish= DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);


        System.out.println("groupingBy(): is used for grouping object by some property and storing results in a map instance");
       Map<Type,List<Dish>> dishType= DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);
    }
}
