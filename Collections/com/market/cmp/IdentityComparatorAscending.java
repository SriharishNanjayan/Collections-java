package com.market.cmp;
import com.market.Stock;
import java.util.Comparator;
public class IdentityComparatorAscending implements Comparator<Stock>{

	@Override
	public int compare(Stock o1, Stock o2) {
		
		return o1.getIdentity().compareTo(o2.getIdentity());
	}

}
