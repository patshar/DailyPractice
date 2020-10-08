package JavaQues1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class hashsetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]={"C", "Java",  "c#", "C", "JavaScript", "Ruby"};
		
		HashMap<String, Integer> Map = new HashMap<String,Integer>();

			for(String name:names) {
			
			Integer count=Map.get(name);
			
			if (count==null) {
				Map.put(name, 1);
				
			}
			else {
				Map.put(name, ++count);
			}
		}
			
			//get the value from hashmap using entryset
			Set<Entry<String,Integer>> entry=Map.entrySet();
			for(Entry<String,Integer> ent:entry) {
				if(ent.getValue()>1) {
					System.out.println("duplicate :"+ent.getKey());
				}
				
			}		
		}
		
		
		//Set<String> valchk= new HashSet<String>();
		
		//for(String name: names){
		//if (valchk.add(name.toUpperCase()) == false){
		  //System.out.println("duplicate value is:" +name);
	//	}
		//}
	}


