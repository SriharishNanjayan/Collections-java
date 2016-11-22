package com.market.cmp;

import java.util.Comparator;

import com.market.Stock;

public class ExpiryDateComparatorAscending implements Comparator<Stock> {

	@Override
	public int compare(Stock o1, Stock o2) {
		return o1.getExpiryDate().compareTo(o2.getExpiryDate());
	}

}
