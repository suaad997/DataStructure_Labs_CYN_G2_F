package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrayss arr=new Arrayss();
        int []numbers={1,2,3,4,5};
        int result=arr.LinearSearch(numbers,2);

        if(result!=-1)
        System.out.println("value found at index :"+result);
        else
        System.out.println("Value not found");
      //  numbers[2]=7;
        //int []numbers=new int[7];

        //
        //arr.delete(numbers,2);
///arr.shiftLeft_Delete(numbers,2);
        // arr.input(numbers);
       // arr.Traversal(numbers);



        //System.out.println(Arrays.toString(numbers));





    }
}
