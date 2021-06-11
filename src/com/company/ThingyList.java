package com.company;

import java.util.ArrayList;


public class ThingyList extends ArrayList<Thingy> {

	public ThingyList()
	{
		super();
	}
	public ThingyList(int number){
		super(number);
	}
	
	public void addThingy(String name, int amt, double rat)
	{
		Thingy  th = new Thingy(name, amt, rat);
		
		this.add(th);
	}
	public void addThingy(Thingy th)
	{
		add(th);
	}
	
	public Thingy getThingy(String name)
	{
		for(int i = 0; i < size(); i++)
		{
			Thingy x = get(i);
			if (x.getName().equals(name))
				return x;
		}
		return null;
	}
	
	
	public int addAmounts()
	{
		int total = 0;
		for(Thingy x: this)
		{
			total += x.getAmount();
		}
		return total;
	}
	
	public double averageRating()
	{
		double total = 0.0;
		for (Thingy x:this)
		{
			total += x.getRating();
		}
		return total/size();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThingyList thingList = new ThingyList(8);
		Thingy t1 = new Thingy("Arthur", 8, 23.6);
		thingList.add(t1);
		
		thingList.addThingy("Beatrice", 2, 18.1);
		
		thingList.addThingy("Clarence", 9, 26.0);
		
		thingList.addThingy("Daphne", 6, 7.4);
		
		System.out.println(thingList.addAmounts());
		System.out.println(thingList.averageRating());
		System.out.println(thingList.getThingy("Beatrice") + "\n");
		
		for(Thingy x: thingList)
		{
			System.out.println(x);
		}
	}

}
