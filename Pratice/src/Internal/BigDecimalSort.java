package Internal;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Random;

public class BigDecimalSort{
    public static void main(String []args) throws ParseException{
        //Input
//        Scanner sc= new Scanner(System.in);
        int n= 10;
        String []s=new String[n];
        
        float b;
        
        Random r = new Random();
//        DecimalFormat d = new DecimalFormat();
        
        for(int i=0;i<n;i++){
        	
        	
        	
            s[i]=  Long.toString(r.nextLong());
        }
        
        
        Long[] l = new Long[n];

        for(int i=0; i<s.length;i++) {
        	l[i] =  Long.parseLong(s[i]);
        }
        
        Arrays.sort(l);
        
        for(int i=0; i<l.length; i++) {
        	s[i] =  Long.toString(l[i]);
        }
        
        
        for(int i=0;i<n;i++)
        {
        	System.out.println(l[i]);
            System.out.println(s[i].replaceAll(",",""));
        }
    }

	
}
