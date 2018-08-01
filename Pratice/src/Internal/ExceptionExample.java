package Internal;

public class ExceptionExample {

	public void doSay(){
		try{
			int i = 0;
			i = i+1;
			System.out.println("Value"+i);
			throw new NullPointerException();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public void doSay1(){
		try{
			int i = 0;
			i = i+2;
			System.out.println("Value"+i);
			throw new NullPointerException();
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public static void main(String args[]){
		
		ExceptionExample obj = new ExceptionExample();
		
		obj.doSay();
		obj.doSay1();
	}
	
}
