package com.csis3275.Model_gra_84;

import java.text.DecimalFormat;

public class Pizza_gra_84 {
//id, size, firstname, lastname, discount, numberOfToppings
//	private int id;
//	private int numberOfToppings;
//	private String firstName;
//	private String lastName;
//	private String discount;
//	private String size;

	//public double price = 0;
	public  String BG = "Personal";
	public String MG = "Medium";
	public  String SG = "Small";
	public  String lg = "Large";
	public double totalCount = 0;
	public double pricetoping = 2.99;
	public  String typePizza;
	public double Personal =  7.99;
	public double Small = 9.99;
	public double Medium = 12.99;
	public double Large = 14.99;
	
	private int id;
	private String size;
	private String firstName;
	private String lastName;
	private Double discount;
	private int numberOfToppings;
	private double price;
	double off =0.0;
	DecimalFormat two = new DecimalFormat("0.00");
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount =  discount;
	}

	public int getNumberOfToppings() {
		return numberOfToppings;
	}

	public void setNumberOfToppings(int numberOfToppings) {
		this.numberOfToppings = numberOfToppings;
	}

	public double getPrice() {
		if (size.matches(BG)) {
			this.totalCount = Personal;
		} else if (size.matches(SG)) {
			this.totalCount = Small;
		} else if (size.matches(MG)) {
			this.totalCount = Medium;
		} else if (size.matches(lg)) {
			this.totalCount = Large;
		}
		off = (this.discount/100)*(this.totalCount + (pricetoping*numberOfToppings));
		double  price1 =  ((totalCount + (pricetoping*numberOfToppings))-off);
	price = Math.round(price1 * 100.0) / 100.0;
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	/*Math for the Pizza is as follows:
	Personal (7.99)
	Small (9.99)
	Medium (12.99)
	Large (14.99)
	Toppings are 1.99 each
*/
	
	
	
	
}
