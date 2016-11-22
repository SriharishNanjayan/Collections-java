package org;

import com.market.Stock;
import com.market.cmp.ExpiryDateComparatorAscending;
import com.market.cmp.ExpiryDateComparatorDescending;
import com.market.cmp.IdentityComparatorAscending;
import com.market.cmp.IdentityComparatorDescending;
import com.market.cmp.ManufacturingDateComparatorAscending;
import com.market.cmp.ManufacturingDateComparatorDescending;
import com.market.cmp.NameComparatorAscending;
import com.market.cmp.NameComparatorDescending;
import com.market.cmp.PriceComparatorAscending;
import com.market.cmp.PriceComparatorDescending;
import com.market.cmp.QuantityComparatorAscending;
import com.market.cmp.QuantityComparatorDescending;

import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class Solution {
	public static void main(String args[]) throws IOException{
		List<Stock> stock = new LinkedList<Stock>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String choice;
		do{
		String identity = bf.readLine();
		String name = bf.readLine();
		int quantity = Integer.parseInt(bf.readLine());
		double price = Double.parseDouble(bf.readLine());
		String manufacturingDate = bf.readLine();
		String expiryDate = bf.readLine();
		stock.add(new Stock(identity,name,quantity,price,manufacturingDate,expiryDate));
		System.out.println("DO YOU WANT TO ADD MORE");
		choice = bf.readLine();
		}while(!choice.equals("no"));
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("ID in Ascending order: ");
		stock.sort(new IdentityComparatorAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("ID in Descending order: ");
		stock.sort(new IdentityComparatorDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("Name in Ascending order: ");
		stock.sort(new NameComparatorAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("Name in Descending order: ");
		stock.sort(new NameComparatorDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("Quantity in Ascending order: ");
		stock.sort(new QuantityComparatorAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("Quantity in Descending order: ");
		stock.sort(new QuantityComparatorDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("Price in Ascending order: ");
		stock.sort(new PriceComparatorAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("Price in Descending order: ");
		stock.sort(new PriceComparatorDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("ManufacturingDate in Ascending order: ");
		stock.sort(new ManufacturingDateComparatorAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("ManufacturingDate in Descending order: ");
		stock.sort(new ManufacturingDateComparatorDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("ExpiryDate in Ascending order: ");
		stock.sort(new ExpiryDateComparatorAscending());
		for(Stock each:stock){
			System.out.println(each);
		}
		System.out.println("ExpiryDate in Descending order: ");
		stock.sort(new ExpiryDateComparatorDescending());
		for(Stock each:stock){
			System.out.println(each);
		}
	}
}
