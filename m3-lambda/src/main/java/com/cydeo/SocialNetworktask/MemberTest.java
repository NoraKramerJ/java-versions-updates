package com.cydeo.SocialNetworktask;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;

import java.util.List;
import java.util.function.Predicate;

public class MemberTest {

    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();

        personList.add( new Person("mike",35,Gender.MALE));
        personList.add(new Person("ozzy",25,Gender.MALE));
        personList.add(new Person("tom",15,Gender.MALE));
        personList.add(new Person("ally",45,Gender.FEMALE));

print(personList,p -> p.getGender()==Gender.MALE && p.getAge() >=18 && p.getAge()<=25);
//or we can pass directly
        print(personList,p -> p.getGender()==Gender.MALE && p.getAge() >=18 && p.getAge()<=25);
    }
    private static void print (List<Person> personList, Predicate <Person> p ){
        List<Person> result=new ArrayList<>();
        for (Person person : personList) {
            if(p.test(person)){
                result.add(person);
        }

        }
        System.out.println(result);
    }
}
