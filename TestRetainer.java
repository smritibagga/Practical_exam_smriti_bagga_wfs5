/*
 * 
 * Author:Smriti Bagga
Purpose: Main driver class

*/

package com.hsbc.practical;

public class TestRetainer {
	public static void main(String[] args) {
		RetainerIntf r=new RetainerDao();
		try { 
			//adding new item in apparel
			r.addApparelItem(new Apparel(1,"Tshirt",300,40,40));
			r.addApparelItem(new Apparel(2,"shirt",300,40,80));
			r.addApparelItem(new Apparel(3,"sweater",300,40,90));
			r.addApparelItem(new Apparel(4,"pant",300,40,140));
			
			//adding item in electronics
			r.addElectronicsItem(new Electronics(1,"TV",40000,12,40));
			r.addElectronicsItem(new Electronics(2,"refrigerator",40000,12,40));
			r.addElectronicsItem(new Electronics(3,"hjh",40000,12,780));
			r.addElectronicsItem(new Electronics(4,"uV",40000,12,80));
			
			//adding item in food item
			r.addfoodItem(new FoodItems(1,"hj",78,StringToDate("2015-12-06 17:03:00"),StringToDate("2015-12-06 17:03:00"),"Yes",50)));
			r.addfoodItem(new FoodItems(2,"hj",78,"12/5/20","5,6,7","Yes",60)));
			r.addfoodItem(new FoodItems(3,"hjhf",78,"12/5/20","5,6,7","Yes",70)));
			r.addfoodItem(new FoodItems(4,"hjsds",78,"12/5/20","5/6/7","Yes",50)));
			
			//calling the report function
			r.report("Apparel");
			
		}
		
		catch (ItemAlreadyExist e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
