package com.market.cmp;
import com.market.Stock;
import java.util.Comparator;
public class IdentityComparatorDescending implements Comparator <Stock> {

	@Override
	public int compare(Stock o1, Stock o2) {
		// TODO Auto-generated method stub
		return o2.getIdentity().compareTo(o1.getIdentity());
	}

}
