package Internal;

public class DupChar {
	
	
	public void removeDuplicates(String input){
	
		StringBuffer s = new StringBuffer();
		
		for(int i=0;i<input.length();i++){
			
			boolean isFound = false;
			for(int j=0;j<s.length();j++){
				if(Character.toLowerCase(s.charAt(j)) == Character.toLowerCase(input.charAt(i))){
					isFound = true;
					break;
				}
				
			}
			
			if(!isFound){
				s.append(input.charAt(i));
			}
			
			
			
		}
		
		System.out.println(s);
	}


	public static void main(String args[]) {
    	
		String input = "AAABBBCCCDDDEEDDGDFdfgdfgdm";
		
		DupChar h = new  DupChar();
		
		
		h.removeDuplicates(input);
		
    	
    }



}
