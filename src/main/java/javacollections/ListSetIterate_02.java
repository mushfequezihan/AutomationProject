package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetIterate_02 {

	public static void main(String[] args) {

		// initialize a list integers
		List<Integer> values = new ArrayList<>();
		values.add(15);
		values.add(3);
		values.add(9);
		values.add(27);
		values.add(3);
		values.add(18);
		values.add(9);
		values.add(3);
		values.add(5);
		values.add(5);
		
		System.out.println("original list:	" + values);
		System.out.println("");
		
		
		
		// repeating values list
		List<Integer> repeatingValues = new ArrayList<>();
		
		//duplicate values list
		List<Integer> duplicateValues = new ArrayList<>();
		
		//Using Set - print only the unique number which duplicating 
		Set<Integer> dupValuesSet = new HashSet<Integer>();
		
		
		
		//iterate through list for repeating and duplicate values
		for (Integer integer : values) {
			
			/*
			 * Collections.frequency(list, element) tells how many times an item appears
			 * If this integer appears more than 1 time, it must be a duplicate.
			 */
			if (Collections.frequency(values, integer) > 1) {
				repeatingValues.add(integer);
			}
			
			/*
			 * This checks whether we've already added integer to the duplicates list. 
			 * It prevents adding the same duplicate again.
			 */
			if (Collections.frequency(values, integer) > 1 && !duplicateValues.contains(integer)) {
				duplicateValues.add(integer);
			}
			
			/*
			 * Simple way - using Set to print only duplicate values
			 * Set allows only unique values to store, removes any duplicates, faster search on list
			 */
			dupValuesSet.addAll(repeatingValues);
			
		}
		
		System.out.println("New list with Repeating Values: " + repeatingValues);
		System.out.println("New list with Duplicate Values: " + duplicateValues);
		System.out.println("");
		System.out.println("Using Set - duplicate values: " + dupValuesSet);
		
		
	}

}
