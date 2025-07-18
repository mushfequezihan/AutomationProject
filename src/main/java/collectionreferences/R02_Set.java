package collectionreferences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class R02_Set {

	public static void main(String[] args) {

		//set to store unique values does not allow duplicates
		Set<String> foodSet = new HashSet<String>();
		foodSet.add("Pizza");
		foodSet.add("Burger");
		foodSet.add("Soda");
		foodSet.add("Burger");
		foodSet.add("Rice");
		foodSet.add("Wings");
		foodSet.add("Wings");
		foodSet.add("Dumplings");
		foodSet.add("Sandwich");
		
		//print set as it is
		System.out.println("set list: " + foodSet);
		
		//search for the item 
		String s = "Soda";
		
		if (foodSet.contains(s)) {
			System.out.println(s + " - item found!");
		} else {
			System.out.println(s + " - item not found!");
		}
		
		//print the set size 
		System.out.println("set size: " + foodSet.size());
		
		
		
		
		//List duplicate storing allowed
		List<String> foodList = new ArrayList<String>();
		foodList.add("Pizza");
		foodList.add("Burger");
		foodList.add("Soda");
		foodList.add("Burger");
		foodList.add("Rice");
		foodList.add("Wings");
		foodList.add("Wings");
		foodList.add("Dumplings");
		foodList.add("Sandwich");
		
		//print list 
		System.out.println("");
		System.out.println("food list: " + foodList);
		
		//print the unique item from the above list
		Set<String> uniqueFood = new HashSet<String>();
		uniqueFood.addAll(foodList);
		System.out.println("unique food list: " + uniqueFood);
		
		
		
	}

}
