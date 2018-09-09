package Internal;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Iterator;

public class StringTest {
	int i;
	int j;
	
	
	StringTest(){
		i = 10;
		j = 20;
	}
	
	public int get() {
		
		return i+j;
		
	}
		
		
}

class mainclass{
	public static void main(String args[]) {
		
		StringTest s = new StringTest();
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(s);
		
		Iterator<Object> i = list.iterator();
		
		while(i.hasNext()) {
			Object temp = i.next();
		}
		
		
		
	}
}
