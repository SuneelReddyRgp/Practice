package Internal;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LeftRotation {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        

        int n = 5;
        
        int d = 4;

//        int[] a = {98,67,35,1,74,79,7,26,54,63,24,17,32,81};
        int a[] = new int[5];
 
        for (int i = 0; i < n; i++) {
            int aItem = i+1;
            a[i] = aItem;
        }
        
             
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int swapElements  = n - d;
        if(swapElements > 0){
                for(int j=d;n>j;j++){
                 temp.add(a[j]);
                }
                //Collections.reverse(temp);
            for(int i = 0; i<d;i++){
                temp.add(a[i]);
            }

            for (Integer val : temp) {
            	System.out.print(val+" ");
    		}
        }
        
        
        
        scanner.close();
    }
}
