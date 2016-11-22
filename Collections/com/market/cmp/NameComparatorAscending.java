package com.market.cmp;
	import com.market.Stock;
	import java.util.Comparator;
	public class NameComparatorAscending implements Comparator<Stock>{

		@Override
		public int compare(Stock o1, Stock o2) {
			
			return o1.getName().compareTo(o2.getName());
		}

}
