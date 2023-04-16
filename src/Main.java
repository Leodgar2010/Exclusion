import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        int[] arr1 = {5, 2, 4, 1, 3};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = Homework1.diffarr(arr1, arr2);
        float [] arr4 = Homework1.dividearr(arr1, arr2);
        Homework1.printarrint(arr3);
        System.out.println();
        Homework1.printarrfloat(arr4);
        */
        // исходные данные для второго домашнего задания
        /* System.out.println(Homework2.inputfloat());
        int [] arr ={8,7,6,5,4,3,2,1,0};
        Homework2.catchedRes(arr);
        Homework2.Task3();
        System.out.println(Homework2.inputstring());
        */
        String [] arr = Homework3.enterData();
        HashMap <String,Object> data =Homework3.parsData(arr);
        Homework3.CreateOutput(data);
    }

}