package com.market.cmp;

import java.util.Comparator;

import com.market.Stock;

public class NameComparatorDescending implements Comparator <Stock>{

	@Override
	public int compare(Stock o1, Stock o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}

}
