package com.cydeo.task;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        System.out.println("print all emails");
        EmployeeData.readAll()
                .map(i->i.getEmpEmail())
                .forEach(System.out::println);

        System.out.println("print all phone numbers");
        EmployeeData.readAll()
                .flatMap(i->i.getEmpPhoneNumber().stream())
                .forEach(System.out::println);


        System.out.println("Print all Phone Numbers with Double Colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumber)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
