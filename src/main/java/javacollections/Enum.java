package javacollections;

public class Enum {

	public static void main(String[] args) {

		//objects and display
		Bill b1 = new Bill(101, "John", cc.OFFER3, 40.56);
		b1.displayBill();
		
		Bill b2 = new Bill(102, "Meghna", cc.OFFER2, 56.76);
		b2.displayBill();
		
		Bill b3 = new Bill(103, "Phillips", cc.OFFER5, 80.17);
		b3.displayBill();

	}

}

//class
class Bill{
	
	//Variables
	private int billId;
	private String customerName;
	private cc couponCode;
	private double bill;
	
	//constructor
	public Bill(int billId, String customerName, cc couponCode, double bill) {
	
		this.billId = billId;
		this.customerName = customerName;
		this.couponCode = couponCode;
		this.bill = bill;
	}

	//getters and setters
	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public cc getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(cc couponCode) {
		this.couponCode = couponCode;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}
	
	//custom methods for offer code and bills
	public void calcFinalBill() {
		
		if (couponCode.equals(cc.OFFER5)) {
			bill = bill - 5;
		} else if (couponCode.equals(cc.OFFER3)) {
			bill = bill - 3;
		} else if (couponCode.equals(cc.OFFER2)) {
			bill = bill - 2;
		}
	}
	
	//displaying final bill
	public void displayBill() {
		
		calcFinalBill(); //calling method for calculation
		
		System.out.println("-----------------------------------");
		System.out.println("Bill ID: " + billId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Coupon Code Applied: " + couponCode);
		System.out.println("Final Bill: " + bill);
		System.out.println("-----------------------------------");
		
	}
}

//Declare ENUM as needed -- user defined data type
enum cc {OFFER5, OFFER3, OFFER2}
