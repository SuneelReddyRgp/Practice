package Internal;

public class DynamicMethodDispatch {
	
	public void display() {
		System.out.println("Class parent");
	}

}

class Demo extends DynamicMethodDispatch{
	public void display() {
		System.out.println("Class child");
	}
}


class Dispatch{
	
	public static void main(String args[]) {
		
		//DynamicMethodDispatch d = new DynamicMethodDispatch();
		//d.display();
		//Demo r = new Demo();
		//r.display();
		
		//DynamicMethodDispatch runtime = new Demo();
		//runtime.display();
		DynamicMethodDispatch run = new Demo();
		run.display();
		
	}
	
}