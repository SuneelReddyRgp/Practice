package Internal;

public class HashMapSyncExample {
	
	
		public void removeDuplicates(String input){
		
			StringBuffer s = new StringBuffer();
			
			for(int i=0;i<input.length();i++){
				
				for(int j=0;j<s.length();j++){
					if(s.charAt(j) == input.charAt(i)){
						continue;
					}
					if(s.length() == j){
						s.append(input.charAt(i));
					}
				}
				
			}
			
			System.out.println(s);
		}
	
	
		public static void main(String args[]) {
	    	
			String input = "AAABBBCCC";
			
			HashMapSyncExample h = new  HashMapSyncExample();
			
			
			h.removeDuplicates(input);
			
	    	
	    }

	
    
}
