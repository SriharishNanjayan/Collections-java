package com.market.cmp;

import java.util.Comparator;

import com.market.Stock;

public class ManufacturingDateComparatorDescending implements Comparator<Stock>{
	public int compare(Stock o1, Stock o2) {
		// TODO Auto-generated method stub
		return o2.getManufacturingDate().compareTo(o1.getManufacturingDate());
	}
}
