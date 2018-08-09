package Internal;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalDifference {

    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr,int length) {
        
        int diag1 = 0;
        int diag2 = 0;
        
        for(int i=0;i<arr[0].length;i++){
            diag1 += arr[i][i];
            diag2 += arr[length-(i+1)][i];
        }
        
        if(diag1 > diag2) {
        	return diag1 - diag2;
        }else {
        	return diag2 - diag1;
        }
        
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");*/

        int[][] arr = {{11,2,4},{4,5,6},{10,8,-12}};
        int n = 3;

        /*for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }*/

        int result = diagonalDifference(arr,n);

        /*bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();*/
        
        System.out.println(result);

        scanner.close();
    }
}
