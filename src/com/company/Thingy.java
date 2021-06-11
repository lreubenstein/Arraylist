package com.company;

import java.util.ArrayList;


public class Thingy {
	private String name;
	private Integer amount;
	private Double rating;

	public Thingy(String s, int a, double r) {
		// TODO Auto-generated constructor stub
		name = s;
		amount = a;
		rating = r;
	}
	public double getRating()
	{
		return rating / 100.0;
	}
	
	public int getAmount()
	{
		return amount + 1;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		String s = name + " " + amount + " " + rating;
		return s;
	}
	
	

	public static void main(String [] args)
	{
		ArrayList<Thingy> thingList = new ArrayList<Thingy>(5);
		Thingy t1 = new Thingy("Arthur", 8, 23.6);
		thingList.add(t1);
		Thingy t2 = new Thingy("Beatrice", 2, 18.1);
		thingList.add(t2);
		Thingy t3 = new Thingy("Clarence", 9, 26.0);
		thingList.add(0, t3);
		Thingy t4 = new Thingy("Daphne", 6, 7.4);
		thingList.add(2, t4);
		
		System.out.println(thingList);
		System.out.println();
		
		for(Thingy x: thingList)
		{
			System.out.println(x);
			System.out.println(x.getAmount());
			System.out.println(x.getRating());
		}
		System.out.println();
		
		System.out.println(thingList.contains(t3));
		//Thingy t5 = new Thingy("Clarence", 9, 26.0);
		Thingy t5=t4;
		System.out.println(thingList.contains(t5));
	}
}



/*
public boolean equals(Object t)
{
	return name.equals(((Thingy)t).name);
}
*/