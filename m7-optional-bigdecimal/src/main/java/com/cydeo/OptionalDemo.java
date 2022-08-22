package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> number= Arrays.asList(2,4,2,10,23);

        //empty() - isPresent()

        Optional<String> empty=Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent());// isPresent meaning there is something inside.
        System.out.println(Optional.of(number).isPresent());

        System.out.println(")))))))))))))))))))))))))))");

        //ifPresent

       Optional<Integer> bigNumber=number.stream().filter(x-> x>100).findAny();
        bigNumber.ifPresent(System.out::println);
        //get
       // System.out.println(bigNumber.get()); this will give an exception(no value present),
        // no value is bigger than a 100 in this case

        //orElse
        System.out.println(bigNumber.orElse(5));// IF NO CONDITION EXIST, THEN WILL PRINT THE ELSE
    }
}

