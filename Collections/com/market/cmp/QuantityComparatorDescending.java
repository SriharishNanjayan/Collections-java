package com.market.cmp;
import java.util.Comparator;
import com.market.Stock;

public class QuantityComparatorDescending implements Comparator<Stock>{
	
	public int compare(Stock o1, Stock o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getQuantity(), o1.getQuantity());
	}
}
