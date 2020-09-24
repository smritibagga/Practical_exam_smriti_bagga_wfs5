/*
 * 
 * Author:Smriti Bagga
Purpose: This creates food item class

*/

package com.hsbc.practical;


import java.util.Date;

public class FoodItems implements Comparable<FoodItems> {
	
	private int itemCode;
	private String itemName;
	private float unitPrice;
	private Date dateOfMfg;
	private Date dateOfExp;
	private String vegeterian;
	private int quantity;
    
	public FoodItems() {}

	public FoodItems(int itemCode, String itemName, float unitPrice, Date dateOfMfg, Date dateOfExp, String vegeterian,
			int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.dateOfMfg = dateOfMfg;
		this.dateOfExp = dateOfExp;
		this.vegeterian = vegeterian;
		this.quantity = quantity;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getDateOfMfg() {
		return dateOfMfg;
	}

	public void setDateOfMfg(Date dateOfMfg) {
		this.dateOfMfg = dateOfMfg;
	}

	public Date getDateOfExp() {
		return dateOfExp;
	}

	public void setDateOfExp(Date dateOfExp) {
		this.dateOfExp = dateOfExp;
	}

	public String getVegeterian() {
		return vegeterian;
	}

	public void setVegeterian(String vegeterian) {
		this.vegeterian = vegeterian;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", dateOfMfg=" + dateOfMfg + ", dateOfExp=" + dateOfExp + ", vegeterian=" + vegeterian + ", quantity="
				+ quantity + "]";
	}

	@Override
	public int compareTo(FoodItems o) {
		
		return this.quantity-o.quantity;
	}
	
	

}
