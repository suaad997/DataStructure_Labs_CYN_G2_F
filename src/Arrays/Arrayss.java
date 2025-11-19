package Arrays;

import java.util.Scanner;

public class Arrayss {
    Scanner scanner = new Scanner(System.in);



    public void Traversal(int []a){
        System.out.println("The elements are:");
        for(int i=0 ;i<a.length;i++)
            System.out.println("Index["+i+"] = "+a[i]);

    }

    public void input(int[]a){
        System.out.println("enter "+a.length+" elements:");
        for (int i=0; i<a.length;i++)
            a[i]=scanner.nextInt();
    }
}
