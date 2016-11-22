package com.market.cmp;

import java.util.Comparator;

import com.market.Stock;

public class QuantityComparatorAscending implements Comparator<Stock>{
	@Override
	public int compare(Stock o1, Stock o2) {
		return Integer.compare(o1.getQuantity(), o2.getQuantity());
	}
}
