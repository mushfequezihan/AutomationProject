package collectionreferences;

import java.util.ArrayList;
import java.util.List;

public class R01_List {

	public static void main(String[] args) {

		// Food Booking APP - GRUBHUB, DOORDASH, UBEREATS, INSTACART

		// Arrays!
		String[] foodArray = new String[4];
		foodArray[0] = "Fries";
		foodArray[1] = "Wings";
		foodArray[2] = "Dumplings";
		foodArray[3] = "Burgers";

		System.out.println("Index array 2: " + foodArray[2]);
		System.out.println("");

		System.out.println("Food Array Lists:");
		for (int i = 0; i < foodArray.length; i++) {
			System.out.println(foodArray[i]);
		}
		
		
		//List
		List<String> foodList = new ArrayList<String>();
		foodList.add("Burger");
		foodList.add("Pizza");
		foodList.add("Fries");
		foodList.add("Burger");
		foodList.add("Rice");
		foodList.add("Soda");
		
		
		//print the 3rd index value
		System.out.println("");
		System.out.println("Food item at 3rd index: " + foodList.get(3));
		
		//print the list as it is (default format)
		System.out.println("print the list: " + foodList);
		
		//size of the list
		System.out.println("Size of the list is: " + foodList.size());
		System.out.println("");
		
		
		
		//display the data using normal for loop
		for (int i = 0; i < foodList.size(); i++) {
			System.out.println("Food Name: " + foodList.get(i));
		}
		
		System.out.println("");
		System.out.println("data with for each -");
		
		//display the data using for each loop - you can not skip any data
		for (String string : foodList) {
			System.out.println("Food: " + string);
		}
		
		
		
		System.out.println("");
		
		//check whether list is empty 
		if (foodList.isEmpty()) {
			System.out.println("Please add item in the Cart!");
		} else {
			System.out.println("You are moving to payment page.");
		}
		
		
		
		
		System.out.println("");
		System.out.println("original list: " + foodList);
		
		//add an item at specified location
		foodList.add(3, "Wings");
		System.out.println("added item at index 3: " + foodList);
		
		//replace an item
		foodList.set(4, "Sandwich");
		System.out.println("replaced item at index 4: " + foodList);
		
		
		
		
		//Merging or combining 2 lists
		List<String> foodList1 = new ArrayList<String>();
		List<String> foodList2 = new ArrayList<String>();
		
		foodList1.add("Fries");
		foodList1.add("Soda");
		foodList1.add("Wings");
		
		foodList2.add("Dumplings");
		foodList2.add("Soda");
		foodList2.add("Pizza");
		
		System.out.println("");
		System.out.println("foodlist1: " + foodList1);
		System.out.println("foodlist2: " + foodList2);
		
		List<String> foodList3 = new ArrayList<String>();
		foodList3.addAll(foodList1); 						//1 is merged to 3
		foodList3.addAll(foodList2); 						//2 is merged to 3
		System.out.println("foodlist3: " + foodList3);
		
		
		
		//remove the data
		foodList3.remove(3);
		System.out.println("foodlist3: " + foodList3);
		System.out.println("");
		
		
		
		//search the list
		String s = "Soda";
		
		if (foodList3.contains(s)) {
			System.out.println(s + " - Food Exits!");
		} else {
			System.out.println(s + " - Food does not Exits!");
		}
		
		
		//clear the list. Delete all the data from the list
		foodList3.clear();
		System.out.println("foodlist3: " + foodList3);
		
	}

}
