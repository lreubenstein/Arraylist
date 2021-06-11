package com.company;

import java.util.ArrayList;


public class Quiz {

	public Quiz() {
		// TODO Auto-generated constructor stub
	}
	
	public static void quizMystery1(ArrayList<Integer> alist)
	{
		for(int x = 0; x < alist.size(); x++)
		{
			alist.add(alist.remove(x));
		}
	}
	public static void quizMystery2(ArrayList<String> blist, String key)
	{
		for(int x = 0; x < blist.size(); x++)
		{
			if(key.equals(blist.get(x)))
				blist.remove(x);
							
			//System.out.println(blist);
		}
	}
	public static void quizMystery3(ArrayList<Integer> list) { 
	    for (int i = list.size() - 2; i > 0; i--) { 
	        int a = list.get(i); 
	        int b = list.get(i + 1); 
	        list.set(i, a + b); 
	    } 
	    System.out.println(list); 
	} 
	
	public static void quizMystery4(ArrayList<Integer> list) {
		for(int i=0; i < list.size(); i++) {
			int element = list.get(i);
			list.remove(i);
			list.add(0, element+1);
		}
	}
	
	public static void stutter(ArrayList<String> alist, int k)
	{
	    int index = 0;
	    while(index < alist.size())
	    {
	        String st = alist.remove(index);
	        for (int i = 0; i < k; i++)
	        {
	            alist.add(index, st);
	            index ++;
	        }
	    }
	}
	/*public static void stutter(ArrayList<String> alist, int k)
	{
	    //int index = 0;
	    for(int index = 0;  index < alist.size(); index += k)
	    {
	        String st = alist.remove(index);
	        for (int i = 0; i < k; i++)
	        {
	            alist.add(index, st);
	            //index ++;
	        }
	    }
	}*/
	public static void listPadder(ArrayList<Integer> list1, ArrayList<Integer> list2)
	{
		for(Integer i: list2){
			if(!list1.contains(i)){
				list1.add(i);
			}
		}
	}

	public static void mirror(ArrayList<Integer> input)
	{
		for(int x = input.size()-1; x >= 0; x--)
		{
			input.add(input.get(x));
		}
	}
	
	public static void backMirror(ArrayList<Integer> input) {
		for(int i = 0; i < input.size();  i = i+2) {
			input.add(0,input.get(i));
		}
	}
	
	public static void removeEvenLength(ArrayList<String> a){
	    int i = 0;
	    while(i < a.size()){
	        String x = a.get(i);
	        if(x.length() %2==0){
	            a.remove(i);
	        }
	        else i++;
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> odds = new ArrayList<Integer>();
		for(int y = 3; y < 18; y+=2)
			odds.add(y);
		System.out.println(odds);
		quizMystery1(odds);
		System.out.println(odds);
		
		ArrayList<Integer> evens = new ArrayList<Integer>();
		for(int y = 6; y < 18; y+=2)
			evens.add(y);
		System.out.println(evens);
		quizMystery4(evens);
		System.out.println(evens);
		
		String[] s = {"hello", "world", "square", "bike", "yo", "dog"};
		ArrayList<String> yoyo = new ArrayList<String>();
		for(String x: s)
			yoyo.add(x);
		System.out.println(yoyo);
		removeEvenLength(yoyo);
		System.out.println(yoyo);
		

//		String[] t = {"LR", "Seven", "silly", "LR", "LR","seals", "LR", "saw", "sanctuary"};
//		ArrayList<String> twister = new ArrayList<String>();
//		for(String x: t)
//			twister.add(x);
//			
//		System.out.println(twister);
//		quizMystery2(twister, "LR");
//		System.out.println(twister);
//		
//		ArrayList<Integer> allnum = new ArrayList<Integer>();
//		for(int y = 1; y <= 6; y++)
//			allnum.add(y);
//		System.out.println(allnum);
//		quizMystery3(allnum);
//		System.out.println(allnum);
//		
//		String [] xx = {"how", "are", "you"};
//		ArrayList<String> stutterlist = new ArrayList<String>();
//		for(String x: xx)
//			stutterlist.add(x);
//		System.out.println(stutterlist);
//		stutter(stutterlist, 4);
//		System.out.println(stutterlist);
//		
//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		for(int i = 2; i < 9; i+=2)
//			list1.add(i);
//		for(int i = 1; i < 9; i++)
//			list2.add(i);
//		System.out.println(list1 + "    " + list2);
//		listPadder(list1, list2);
//		System.out.println(list1 + "    " + list2);
//		
//		ArrayList<Integer> threes = new ArrayList<Integer>();
//		for(int y = 2; y < 18; y+=3)
//			threes.add(y);
//		System.out.println(threes);
//		mirror(threes);
//		System.out.println(threes);
//		
//		ArrayList<Integer> ttt = new ArrayList<Integer>();
//		for(int y = 1; y <= 4; y++)
//			ttt.add(y);
//		System.out.println(ttt);
//		backMirror(ttt);
//		System.out.println(ttt);
	}

}
