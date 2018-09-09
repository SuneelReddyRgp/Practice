package Internal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedListSolution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }

      
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
        while (node != null) {
            System.out.println(String.valueOf(node.data));

            node = node.next;
        }
    }
    
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    	
    	SinglyLinkedListNode node = new SinglyLinkedListNode(data);
    	
    	SinglyLinkedListNode tempref = head;
    	
    	
	    	if(tempref == null) {
	    		return node;
	    	}
    		while(tempref.next != null) {
    			//System.out.print(temp.head.data);
    			tempref = tempref.next;
    			
    		}
    		 System.out.println("\n");
    		
    		 tempref.next = node;
    		
    		 
    		return head;
    		
    }
    
    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();
        
        Random r = new Random();
        
        @SuppressWarnings("unchecked")
		ConcurrentHashMap<Integer, Integer> h = new ConcurrentHashMap<>();
        h.put(1, 2);
        h.put(2, 2);
        h.put(3, 2);
        
        
        Iterator<Integer> l = h.keySet().iterator();
        
        
        

       // int llistCount = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 10; i++) {
            int llistItem = i;
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        	System.out.println(llistItem);
          SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
          
          llist.head = llist_head;
//          System.out.println(llist.head);
        }


        while(llist.head != null) {
        	System.out.println(llist.head.data);
        	llist.head = llist.head.next;
        }
        //printSinglyLinkedList(llist.head);
//        bufferedWriter.newLine();

//        bufferedWriter.close();

//        scanner.close();
    }
}