package basicInterviewQuestions;

import java.util.*;



public class IterateHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		        map.put(28, "richard");
		
		        map.put(8, "nicky");
		
		        map.put(6, "rachell");
		
		        System.out.println(map.size());
		
		        System.out.println("While Loop:");
	
		        Iterator itr = map.entrySet().iterator();
		
		        while(itr.hasNext()) {
		
		            Map.Entry me = (Map.Entry) itr.next();
		
		            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
		
		        }
		
		        System.out.println("For Loop:");
	
		        for(Map.Entry me2: map.entrySet()) {
		
		            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
		
		        }


	}

}
