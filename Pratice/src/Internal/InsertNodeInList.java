package Internal;
import java.io.IOException;
import java.util.Random;

public class InsertNodeInList {

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
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
            System.out.println(nodeData);
        }
    }

   /* public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }
    */
    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode tempNode = head;
        SinglyLinkedListNode previousNode;
        SinglyLinkedListNode nodeData = new SinglyLinkedListNode(data);
//        SinglyLinkedListNode tempAddress;
        
        if(position == 0){
            nodeData.next = head;
            return nodeData;
        }
        else{
            int i = 0;
            previousNode = head;
            while(i != position){
                i++;
                if(tempNode!=null) {
                	previousNode = tempNode;
                    tempNode = tempNode.next;
                }else {
                	break;
                }
            }
            nodeData.next = tempNode;
            previousNode.next = nodeData;
        }
        
        
        
    return head;

    }
    
    //private static final Scanner scanner = new Scanner(System.in);

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        SinglyLinkedList llist = new SinglyLinkedList();
//        Random r = new Random();
//        int llistCount = r.nextInt(5);
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int llistItem = i;
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            llist.insertNode(llistItem);
        }

        int data = 6;
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int position = 0;
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Position"+position);
        System.out.println("Data"+data);
        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
        
        if(llist_head != null) {
        	System.out.println(llist_head.data);
        	while(llist_head.next!= null) {
        		llist_head = llist_head.next;
        		System.out.println(llist_head.data);
        	}
        	
        }

       // printSinglyLinkedList(llist_head, " ", bufferedWriter);
       // bufferedWriter.newLine();

       // bufferedWriter.close();

       // scanner.close();
    }
}