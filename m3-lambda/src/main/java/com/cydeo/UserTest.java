package com.cydeo;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {


        List<User> users= new ArrayList<>();

        users.add(new User("Mike","Smith",35));
        users.add(new User("Tom","Evan",25));
        users.add(new User("Emma","Eollard",55));



        //Print all elements in the list
        printName(users,user -> true);

        //Print all people that last name starts with E
        printName(users,user -> user.getLastname().startsWith("E"));
    }

    private static void printName(List<User> users, Predicate<User> p){
        for(User user : users) {
            if (p.test(user)) {
                System.out.println(user.toString());
            }
            //another way to do it

            Consumer<List<User>> display = i -> System.out.println(i);
            display.accept(users);
            //Print all elements in the list
            System.out.println("__________________");
            for (User each : users) {
                if (each.getLastname().startsWith("E")) {
                    System.out.println(each);
                }

            }


        }}}
