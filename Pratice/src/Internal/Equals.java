package Internal;

public class Equals {

	
	public static void main(String args[]) {
		Equals e = new  Equals();
		Equals e1 = new Equals();
		if(e1 == e) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(e1.equals(e1)) {
			System.out.println("false");
		}else {
			System.out.println("false");
		}
	}
	
	
	
	
}
