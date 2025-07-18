package collectionreferences;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class R02_Map {

	public static void main(String[] args) {

		/*
		 * Map - values can be repeated but keys can not be 
		 * no index number logic
		 */
		Map<String,String> foodMap = new LinkedHashMap<>();
		foodMap.put("F1", "Pizza");
		foodMap.put("F2", "Wings");
		foodMap.put("F3", "Soda");
		foodMap.put("F4", "Pizza");
		foodMap.put("F5", "Burger");
		foodMap.put("F6", "Soda");
		
		//print the map as it is
		System.out.println("food map list: " + foodMap);
	
		
		//check whether the key exits or not 
		String s = "F7";
		
		if (foodMap.containsKey(s)) {
			System.out.println(s + " - Sorry the item code already exits!");
		} else {
			foodMap.put("F7", "Wings");
			System.out.println(s + " - Item added Successfully!");
		}
		
		
		//size of the map
		System.out.println("Total items in the fodd map: " + foodMap.size());
		
		
		//display the value by passing the key 
		System.out.println("Food name of F4 is: " + foodMap.get("F4"));
		
		
		/*
		 * display the key and values in user defined format using loop
		 * declare Set for sorting keys
		 * extract the keys and store it
		 * Set also can be declare without new keyword if values are extracted already like below
		 */
		Set<String> keys = foodMap.keySet();				
		
		System.out.println("");
		System.out.println("Display Map with Key and Values-");
		for (String string : keys) {
			System.out.println("Food Key: " + string + " Food Values: " + foodMap.get(string));
		}
		
		
		/*
		 * extract only the values
		 * 
		 * extract the values and store it
		 */
		List<String> foodValues = new ArrayList<String>();		
		foodValues.addAll(foodMap.values());					
		
		System.out.println("");
		System.out.println("ONLY food Values: " + foodValues);
		
		
		//print the key name of pizza
		for (String string : keys) {
			
			String valueName = foodMap.get(string);
			
			if (valueName.equals("Pizza")) {
				System.out.println("key of " + valueName + " is: " + string);
			}
		}
		
		
		
		//delete an entry from the map
		System.out.println("");
		System.out.println("food map list: " + foodMap);
		
		foodMap.remove("F4");
		System.out.println("food map after remove a key: " + foodMap);
		
		
		//clear the entire map
		foodMap.clear();
		System.out.println("food map after clear the map: " + foodMap);
		
		
		
	}

}
