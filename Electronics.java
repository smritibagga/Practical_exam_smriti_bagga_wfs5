/*
 * 
 * Author:Smriti Bagga
Purpose: This creates food electronics class

*/
package com.hsbc.practical;

public class Electronics implements Comparable<Electronics> {
	private int itemCode;
	private String itemName;
	private float unitPrice;
	private int warrantyMonths;
	private int quantity;
	
	
	public Electronics() {}


	public Electronics(int itemCode, String itemName, float unitPrice, int warrantyMonths, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.warrantyMonths = warrantyMonths;
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


	public int getWarrantyMonths() {
		return warrantyMonths;
	}


	public void setWarrantyMonths(int warrantyMonths) {
		this.warrantyMonths = warrantyMonths;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice
				+ ", warrantyMonths=" + warrantyMonths + ", quantity=" + quantity + "]";
	}


	@Override
	public int compareTo(Electronics o) {
		
		return this.quantity-o.quantity;
	}
	
	

}
