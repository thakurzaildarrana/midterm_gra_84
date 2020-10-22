package com.csis3275.Model_gra_84;

public class Pizza_gra_84 {
//id, size, firstname, lastname, discount, numberOfToppings
	private int id;
	private int numberOfToppings;
	private String firstname;
	private String lastname;
	private String discount;
	private String size;
	public double Personal =  7.99;
	public double Small = 9.99;
	public double price = 0;
	public  String BG = "Personal";
	public String MG = "Medium";
	public  String SG = "Small";
	public  String lg = "Large";
	public double totalCount = 0;
	public double pricetoping = 2.99;
	
	public double Medium = 12.99;
	public double Large = 14.99;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumberOfToppings() {
		return numberOfToppings;
	}
	public void setNumberOfToppings(int numberOfToppings) {
		this.numberOfToppings = numberOfToppings;
	}

	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	/*Math for the Pizza is as follows:
	Personal (7.99)
	Small (9.99)
	Medium (12.99)
	Large (14.99)
	Toppings are 1.99 each
*/
	public Double getPrize() {
		
			if (size.matches(BG)) {
				price = Personal;
			} else if (size.matches(MG)) {
				price = Small;
			} else if (size.matches(SG)) {
				price = Medium;
			} else if (size.matches(lg)) {
				price = Large;
			}
			return this.totalCount = price + numberOfToppings*pricetoping  ;
		
	}
	
	
	
}
