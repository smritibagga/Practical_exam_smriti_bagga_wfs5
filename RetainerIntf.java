/*
 * 
 * Author:Smriti Bagga
Purpose: Interface for RetainerDao class

*/

package com.hsbc.practical;

public interface RetainerIntf {
	
	
void addfoodItem(FoodItems f) throws ItemAlreadyExist;
void addApparelItem(Apparel a) throws ItemAlreadyExist;
void addElectronicsItem(Electronics e) throws ItemAlreadyExist;
void report(String s) throws CategoryException;

}
