package Com.Cydeo.Java10;

import java.util.Optional;

public class OrElseThrowDemo {

    public static void main(String[] args) {

        Optional<String>str=Optional.empty();

        if(str.isPresent()){
            System.out.println(str.get());
        }else{
            //exception handling
        }
        System.out.println(str.orElseThrow());

        //get() will throw you NoSuchElementException but, with orElseThrow, you can throw the exception you want.
        //Imagine using .get() method in your application in a lot of places, so if you get NoSuchElementException
        // you won't be able to know from which .get() method it is coming,
        // but with orElseThrow() you will be able to throw any exception you want in anywhere in your application,
        // so that you can know exactly where 3exception is coming from.
    }
}
