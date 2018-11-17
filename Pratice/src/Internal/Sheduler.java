package Internal;

import java.awt.List;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;


public class Sheduler{
	
	
	@SuppressWarnings({ "unchecked", "null" })
	public static ArrayList getTimeSlot(String Name,ArrayList prefTime,ArrayList<ArrayList> currentMeetings, int duration) {
		
		int prefStart = (int) prefTime.get(0);
		int PrefEnd = (int) prefTime.get(1);
		
		@SuppressWarnings("rawtypes")
		ArrayList set1;
		ArrayList set2;
		
		ArrayList<ArrayList> result = new ArrayList<>();
		
		
		for(int i=0;i<currentMeetings.size();i++) {
			
			set1 = currentMeetings.get(i);
			if(i+1 != currentMeetings.size()) {
				set2 = currentMeetings.get(i+1);
			}else {
				break;
			}
			
			
			int start = (int) set1.get(1);
			int end = (int) set2.get(0);
			
			if(end - start == duration &&  prefStart <= start && PrefEnd >= end) {
				
				
				ArrayList temp = new ArrayList<>();
				
				temp.add(start);
				
				temp.add(end);
				
				System.out.println("["+start+","+end+"]");
				
				result.add(temp);
				
				if(i+1 == currentMeetings.size()) {
					
					if(Integer.parseInt((String) prefTime.get(1)) > Integer.parseInt((String) set2.get(1)) {
						result.add((ArrayList) prefTime.get(1));
						result.add((ArrayList) set2.get(1));
					
				}
			}
		}


		
		
		
		return result;
		
	}
	
	
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		
		ArrayList pref = new ArrayList<>();
		pref.add(9);
		pref.add(18);
		
		ArrayList temp = new ArrayList<>();
		ArrayList temp1 = new ArrayList<>();
		ArrayList temp2 = new ArrayList<>();
		
		temp.add(10);
		temp.add(18);
		
		
		
		ArrayList<ArrayList> currentMeetings = new ArrayList<>();
		
		currentMeetings.add(temp1);
		temp1.add(0, 13);
		temp1.add(1, 14);
		currentMeetings.add(temp2);
		temp2.add(0, 16);
		temp2.add(1, 18);
		
		currentMeetings.add(temp);
		
		ArrayList result = new ArrayList<>();
		
		
		
		
		
		result =	getTimeSlot("sun",pref,currentMeetings,2);
		
		ArrayList pref1 = new ArrayList<>();
		pref1.add(8);
		pref1.add(18);
		
		temp.set(0,8);
		temp.set(1,9);
		temp1.add(0,11);
		
		
		temp1.add(1, 14);
		
		ArrayList<ArrayList> currentMeetings1 = new ArrayList<>();
		
		currentMeetings1.add(temp);
		currentMeetings1.add(temp1);
		
		
		result =	getTimeSlot("sun",pref,currentMeetings1,2);
		
		getTimeSlot("sun",pref,currentMeetings1,2);
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
}
