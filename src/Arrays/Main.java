package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arrayss arr=new Arrayss();
        int []numbers={2,1,3,4,5,7,6,9};
        Arrays.sort(numbers);
        arr.Traversal(numbers);
       // int result=arr.LinearSearch(numbers,2);
        int result=arr.binarySearch(numbers,2,0,numbers.length-1);

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
