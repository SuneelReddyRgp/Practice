package Internal;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExample {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        
        
    	
if(magazine.length < note.length){
            
            for(int i=0; i<magazine.length; i++){
                ArrayList temp = new ArrayList(Arrays.asList(note));
                if(temp.contains(magazine[i])) {
                    temp.remove(magazine[i]);
                    if(i+1 == magazine.length) {
                        System.out.println("Yes");
                    }
                    continue;
                    
                }else {
                    System.out.println("No");
                    break;
                }
            }
        
        }else {
        	ArrayList temp = new ArrayList(Arrays.asList(magazine));
            for(int i=0; i<note.length; i++){
                
                if(temp.contains(note[i])) {
                    temp.remove(note[i]);
                    if(i+1 == note.length) {
                        System.out.println("Yes");
                    }
                    continue;
                }else {
                    System.out.println("No");
                    break;
                }
                
            }
        }

        
        

    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	
        //String[] mn = scanner.nextLine().split(" ");

       // int m = Integer.parseInt(mn[0]);

       // int n = Integer.parseInt(mn[1]);

        //String[] magazine = new String[m];

       // String[] magazineItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s1 = "two times three is not four";
        String s2 = "two times two is four";
       // two times two is four

       // for (int i = 0; i < m; i++) {
       String[] magazine = s1.split(" ");
            
       // }

        String[] note = s2.split(" ");

       // String[] noteItems = scanner.nextLine().split(" ");
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            String noteItem = noteItems[i];
//            note[i] = noteItem;
//        }

       checkMagazine(magazine, note);

       // scanner.close();
    }
}
