import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        
        int finalSum = -99999;
        
        int hourGlassSum = 0;
        
        int scanIndex = 0;
        int loopCount = 2;
        int hourGlass = 0;
        for(int i=hourGlass; i<6;i++,loopCount--){
            
            for(int j=scanIndex;j<scanIndex+3;j++){
                if(loopCount == 1){
                	if(j+2 == scanIndex + 3){
                		hourGlassSum += arr[i][j];
                		 System.out.print(arr[i][j]);
                	}
                }else{
                    hourGlassSum += arr[i][j];
                    System.out.print(arr[i][j]);
                }
              
            }
            
                     System.out.println();
            if(hourGlass + 3 >= 6 && scanIndex+3 >= 6 && loopCount == 0){
            	if(hourGlassSum > finalSum){
                    finalSum = hourGlassSum;
                }
                   break;
            }
            
            if(loopCount == 0){
            	
            	if(hourGlass + 3 >= 6){
                    scanIndex = scanIndex + 1;
                    hourGlass = 0;
                    i = -1;
                }else{
                    hourGlass = hourGlass + 1;
                    i = hourGlass - 1;
                }
                
                
                
                loopCount = 3;
                if(hourGlassSum > finalSum){
                    finalSum = hourGlassSum;
                }
                hourGlassSum = 0;
                continue;
            }
            
            
        }
       
        return finalSum;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        Random r = new Random();

        int[][] arr = {{3,7,-3, 0 ,1 ,8},{1,-4,-7,-8,-6,5},
        		{-8,1,3,3,5,7},
        		{-2,4,3,1,2,7},
        		{2,4,-5,1,8,4},
        		{5,-7,6,5,2,8}};
        /*for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                arr[i][j] = r.nextInt(9);
                System.out.print(arr[i][j]);
            }
            System.out.println("\n");
        }*/

        int result = hourglassSum(arr);
        System.out.println("final sum"+result);

    }
}
