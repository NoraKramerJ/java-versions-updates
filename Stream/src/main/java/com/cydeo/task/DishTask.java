package com.cydeo.task;

public class DishTask {


    public static void main(String[] args) {
//Print all dish's name that has less than 400 calories

DishData.getAll()
        .stream()
        .filter(i->i.getCalories()<400)
        .map(i->i.getName())
        .forEach(System.out::println);
//Print the length of the name of each dish
        System.out.println("----------------");
DishData.getAll()
        .stream()
        .map(i->i.getName().length())
        .forEach(System.out::println);
//Print three high caloric dish name (>300)
        System.out.println("--------------");
DishData.getAll()
        .stream()
        .filter(i->i.getCalories()>300)
        .map(i->i.getName())
        .limit(3)
        .forEach(System.out::println);
        System.out.println("---------------");
//Print all dish name that are below 400 calories in sorted
        DishData.getAll()
                .stream()
                .filter(i->i.getCalories()<400)
                .map(i->i.getName())
                .sorted()
                .forEach(System.out::println);
    }

}






