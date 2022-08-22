package Com.Cydeo.Java9;

import java.util.*;

public class FactoryMethodDemo {

    public static void main(String[] args) {


        //creating unmodifiable List before Java9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("JAVA", "Spring", "agile"));
        //  courses.add("TS");
        System.out.println(courses);


        //creating unmodifiable List after Java9

        List<String> myCourses=List.of("Java","Spring","Agile");

        //creating unmodifiable Set after Java9
        Set<String> myProduct=Set.of("Milk","Bread","Butter");

        //creating unmodifiable Map after Java9
        Map<String,Integer> myCart= Map.ofEntries(Map.entry("Samsun TV",1), Map.entry("PSP",1),
                Map.entry("Chair",5));


    }
}
