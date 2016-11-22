package com.market.cmp;

import java.util.Comparator;

import com.market.Stock;

public class ExpiryDateComparatorDescending implements Comparator<Stock>{

	@Override
	public int compare(Stock o1, Stock o2) {
		return o2.getExpiryDate().compareTo(o1.getExpiryDate());
	}

}
