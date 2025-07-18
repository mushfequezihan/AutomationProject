package collectionreferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class R02_CollectionList {

	public static void main(String[] args) {

		// ENUM can access though class defined in Customer ENUM
		ct customerType = ct.Platinum; // access through data type defined

		//list of integers
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(8);
		numList.add(15);
		numList.add(20);
		numList.add(8);
		numList.add(34);
		numList.add(19);

		System.out.println("list of num: " + numList);

		// MIN/max smallest numb in list or largest
		System.out.println("Smallest num is: " + Collections.min(numList));
		System.out.println("Largest num is: " + Collections.max(numList));

		// sort the data
		Collections.sort(numList);
		System.out.println("Sorting num: " + numList);

		// reverse the data
		Collections.reverse(numList);
		System.out.println("Reverse num: " + numList);

		// counting the frequency
		System.out.println("Num of 8 in the list: " + Collections.frequency(numList, 8));

		// shuffle the data
		Collections.shuffle(numList);
		System.out.println("Shuffling num: " + numList);
	}

}
