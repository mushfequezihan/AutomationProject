package javacollections;

import java.util.ArrayList;
import java.util.List;

class E01_AmazonValidateList {

	// main method
	public static void main(String[] args) {

		// creating objects
		Amazon a1 = new Amazon("Yoga Mat", 43.22, 2);
		Amazon a2 = new Amazon("Samsung 55 Inch TV", 500.50, 0);
		Amazon a3 = new Amazon("Cleaning Liquid", 10.00, 9);

		// all objects added in list
		List<Amazon> amazonlist = new ArrayList<>();
		amazonlist.add(a1);
		amazonlist.add(a2);
		amazonlist.add(a3);

		// calling method for all to validate
		for (Amazon amazon : amazonlist) {
			amazon.validateQuantity();
		}
	}

}

//class
class Amazon{
	
	// variables
		private String productName;
		private double price;
		private int quantityRemaining;

		// parameterized constructor
		public Amazon(String productName, double price, int quantityRemaining) {
			this.productName = productName;
			this.price = price;
			this.quantityRemaining = quantityRemaining;
		}

		// getters and setters method
		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getQuantityRemaining() {
			return quantityRemaining;
		}

		public void setQuantityRemaining(int quantityRemaining) {
			this.quantityRemaining = quantityRemaining;
		}

		// custom method
		public void validateQuantity() {

			if (quantityRemaining == 0) {
				System.out.println(productName + " - The item is not available.");
			} else if (quantityRemaining >= 1 && quantityRemaining <= 5) {
				System.out.println(productName + " - The item is running short.");
			} else {
				System.out.println(productName + " - The Item is Available.");
			}
		}
}