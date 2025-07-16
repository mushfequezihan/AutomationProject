package javacollections;

import java.util.ArrayList;
import java.util.List;

public class AmazonCartList {
	
	public static void main(String[] args) {

		//create a Array List 
		List<String> AmazonCart_One = new ArrayList<>();
		AmazonCart_One.add("Samsung 55 Inch TV");
		AmazonCart_One.add("JML Sound Bar");
		AmazonCart_One.add("Table Lamp");
		AmazonCart_One.add("Echo Dot");
		
		System.out.println("Product name at 2nd Index: " + AmazonCart_One.get(2));
		System.out.println();
		
		//remove product and replace at index 2
		AmazonCart_One.remove(2);
		AmazonCart_One.add(2, "Table Fan");
		
		List<String> AmazonCart_Two = new ArrayList<>();
		AmazonCart_One.add("Cleaning Mop");
		AmazonCart_One.add("Yoga Mat");
		
		List<String> AmazonCart_Final = new ArrayList<>();
		AmazonCart_Final.addAll(AmazonCart_One);
		AmazonCart_Final.addAll(AmazonCart_Two);
		
		//added all cart and print size of cart
		System.out.println("Size of AmazonCart_Final: " + AmazonCart_Final.size());
		System.out.println("");
		
		System.out.println("All the products of AmazonCart_Final:");
		for (String string : AmazonCart_Final) {
			System.out.println(string);
		}
		
		// search item in cart
		System.out.println("");
		
		String s = "Yoga Mat";
		
		if (AmazonCart_Final.contains(s)) {
			System.out.println(s + " - Item Found!");
		}else {
			System.out.println(s + " - Item Not Found");
		}
	} 

}