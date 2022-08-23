package Com.Cydeo.Java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {

    //Type Inference
    public static void main(String[] args) {


        var number=5;
        var str="Nora";
        var price=12.5;

        var numbers= Arrays.asList(3,4,5,6);
        var sum=0;
        for (Integer each : numbers) {
            sum=sum+each;
        }
    }

}
