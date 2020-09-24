/*
 * 
 * Author:Smriti Bagga
Purpose: This creates Data access from treeset for the main class

*/
package com.hsbc.practical;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class RetainerDao implements RetainerIntf {
	//creates treeset
	Set<FoodItems> foodItemts = new TreeSet<>();
	Set<Apparel> appts = new TreeSet<>();
	Set<Electronics> elects = new TreeSet<>();

	@Override
	// add fooditem if already exist then throw exception
	public void addfoodItem(FoodItems f) throws ItemAlreadyExist {
		boolean flag = false;
		int j = f.getItemCode();
		for (FoodItems fi : foodItemts) {
			if (fi.getItemCode() == j) {
				flag = true;
				throw new ItemAlreadyExist("Item Already Exist");

			}

		}
		if (flag == false)
			foodItemts.add(f);

	}

	@Override
	// add apparel if already exist then throw exception
	public void addApparelItem(Apparel a) throws ItemAlreadyExist {
		boolean flag = false;
		int j = a.getItemCode();
		for (Apparel fi : appts) {
			if (a.getItemCode() == j) {
				flag = true;
				throw new ItemAlreadyExist("Item Already Exist");
			}

		}
		if (flag == false)
			appts.add(a);

	}

	@Override
	// add electronic item if already exist then throw exception
	public void addElectronicsItem(Electronics e) throws ItemAlreadyExist {
		boolean flag = false;
		int j = e.getItemCode();
		for (Electronics fi : elects) {
			if (fi.getItemCode() == j) {
				flag = true;
				throw new ItemAlreadyExist("Item Already Exist");
			}

		}
		if (flag == false)
			elects.add(e);

	}

	@Override
	public void report(String s) throws CategoryException

	{
		if (s.equals("Food Item")) {
			int j = 0;
			Iterator<FoodItems> it = foodItemts.iterator();
			while (j < 3) {
				FoodItems b = it.next();
				System.out.println(b);
			}
		}
		else if (s.equals("Electronics")) {
			int j = 0;
			Iterator<Electronics> it = elects.iterator();
			while (j < 3) {
				Electronics b = it.next();
				System.out.println(b);
			}
		}
		else if(s.equals("Apparel")){
				int j = 0;
				Iterator<Apparel> it = appts.iterator();
				while (j < 3) {
					Apparel b = it.next();
					System.out.println(b);
				
			}
		}
		else throw new CategoryException("Category doesn't Exist");

	}

}
