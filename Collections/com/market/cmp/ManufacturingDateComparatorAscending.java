package com.market.cmp;

import java.util.Comparator;

import com.market.Stock;

public class ManufacturingDateComparatorAscending implements Comparator<Stock>{
	@Override
	public int compare(Stock o1, Stock o2) {
		
		return o1.getManufacturingDate().compareTo(o2.getManufacturingDate());
	}
}
