package collectionreferences;

import java.util.ArrayList;
import java.util.List;

public class R01_CustomerList {

	public static void main(String[] args) {

		/*
		 * Pass the Customer Data
		 * Call the Display Details method
		 * Call the Display coupon code
		 */
		
		//a object/copy of the customer class will be created
		Customer c1 = new Customer();
		c1.setCustomerId(101);
		c1.setCustomeName("Philips");
		c1.setCustomerAge(32);
		c1.displayDetails();
		System.out.println("Hi " + c1.getCustomeName() + ", your coupon code is: " + c1.displayCouponCode());
		
		Customer c2 = new Customer();
		c2.setCustomerId(102);
		c2.setCustomeName("Ann");
		c2.setCustomerAge(62);
		c2.displayDetails();
		System.out.println("Hi " + c2.getCustomeName() + ", your coupon code is: " + c2.displayCouponCode());
		System.out.println("");
	
		
		//object with parameterized constructor
		Customer c3 = new Customer(103,"Grey",36);
		c3.displayDetails();
		System.out.println("Hi " + c3.getCustomeName() + " your coupon code is: " + c3.displayCouponCode());
		
		Customer c4 = new Customer(104,"John",76);
		c4.displayDetails();
		System.out.println("Hi " + c4.getCustomeName() + " your coupon code is: " + c4.displayCouponCode());
		
		Customer c5 = new Customer(105,"Elma",26);
		c5.displayDetails();
		System.out.println("Hi " + c5.getCustomeName() + " your coupon code is: " + c5.displayCouponCode());
		System.out.println("");
		
		
		
		Customer c6 = new Customer(106,"Ahmed",20);
		Customer c7 = new Customer(107,"Musa",40);
		Customer c8 = new Customer(108,"Kareem",66);
		
		/*
		 * if you want to store objects of a class in a list
		 * type of the list should be the class name
		 */
		List<Customer> customList = new ArrayList<Customer>();
		customList.add(c6);
		customList.add(c7);
		customList.add(c8);
		
		//print all through loop
		for (Customer customer : customList) {
			
			customer.displayDetails();
			System.out.println("Hi " + customer.getCustomeName() + " your coupon code is: " + customer.displayCouponCode());
		}
	}

}

//class
class Customer{
	
	private int customerId;
	private String customeName;
	private int customerAge;
	
	public Customer() {}	//default constructor 
	
	//constructor (constructor name and class name should be same)
	public Customer(int customerId, String customeName, int customerAge) {
		
		this.customerId = customerId;
		this.customeName = customeName;
		this.customerAge = customerAge;
	}

	//getters and setters method
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomeName() {
		return customeName;
	}

	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
	//user defined methods
	public void displayDetails() {
		
		System.out.println("==================================");
		System.out.println("Hi Your Registration is Successful");
		System.out.println("Customer ID: " + customerId);
		System.out.println("Customer Name: " + customeName);
		System.out.println("Customer Age: " + customerAge);
	}
	
	
	public String displayCouponCode() {
		
		if (customerAge > 60) {
			return "OFFER60";
		} else { 
			return "OFFER30";
		}
		
	}
	
	
	
	
	
	
	
	
}