package Com.Cydeo.Java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {

    public static void main(String[] args) {


        List<Integer> numberLIst= Arrays.asList(2,4,6,8);
        List<Integer> unmodifiableLIst2=List.of(2,4,5,6);// CREATING THE LIST WHEN USING
        List<Integer> unmodifiableLIst=List.copyOf(numberLIst);
        //this one takes a ready list or collection
    }
}
