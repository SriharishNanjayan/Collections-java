package com.market.cmp;

import java.util.Comparator;

import com.market.Stock;

public class PriceComparatorDescending implements Comparator<Stock>{
	@Override
	public int compare(Stock o1, Stock o2) {
		
		return Double.compare(o2.getPrice(), o1.getPrice());
	}
}
