package Internal;

class Node{
	
	Node left;
	Node right;
	int key;
	
	Node(int data){
		
		key = data;
		left=right=null;
		
	}
	
}

public class BinarySearchTree {

	
	Node root;
	
	BinarySearchTree(){
		root = null;
	}
	
	BinarySearchTree(int key){
		
		root = insertRec(root,key);
		
	}
	
	public void insert(int key) {
		
		root = insertRec(root,key);
	}
	
	public void inOrder() {
		inorderRec(root);
	}
	
	void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
	
	private Node insertRec(Node root, int key) {
		if(root != null) {
			if(key < root.key) {
				root.left = insertRec(root.left,key);
			}else{
				root.right = insertRec(root.right,key);
			}
		}else {
			root = new Node(key);
		}
		
		return root;
	}
	
	

	public static void main(String args[]){
		
		BinarySearchTree tree = new BinarySearchTree();
		
		    tree.insert(50);
	        tree.insert(30);
	        tree.insert(20);
	        tree.insert(40);
	        tree.insert(70);
	        tree.insert(60);
	        tree.insert(80);
		
		tree.inOrder();
		
		
	}
	
}
