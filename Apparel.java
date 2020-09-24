package com.hsbc.practical;
/*
 * 
 * Author:Smriti Bagga
Purpose: This creates apparel class

*/


public class Apparel implements Comparable<Apparel> {
	private int itemCode;
	private String itemName;
	private float unitPrice;
	private int size;
	private int quantity;
	
	public Apparel() {}

	public Apparel(int itemCode, String itemName, float unitPrice, int size, int quantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.unitPrice = unitPrice;
		this.size = size;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice=" + unitPrice + ", size="
				+ size + ", quantity=" + quantity + "]";
	}

	@Override
	public int compareTo(Apparel o) {
		
		return this.quantity-o.quantity;
	}
	
	
}
