package collectionreferences;

//constant user data type - defined outside of class as ENUM
enum ct {Diamond, Platinum, Silver}

public class R02_CustomerEnum {

	public static void main(String[] args) {

		int billID = 102;
		String customerName = "Phillips M";
		ct customerType = ct.Diamond;			//Accessing ENUM through data type defined
		double bill = 44.32;
		
		System.out.println("Bill ID: " + billID);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Type: " + customerType);
		System.out.println("Total Bill: " + bill);
	}

}
