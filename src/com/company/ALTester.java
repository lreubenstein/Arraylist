package com.company;

import java.util.ArrayList;


public class ALTester {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myIntList = new ArrayList<Integer>(20);
		for(int i = 25; i >2; i-=2){
			myIntList.add(i);
		}
		System.out.println(myIntList + " size is " + myIntList.size());
		myIntList.add(3);
		myIntList.add(4,-6);
		System.out.println(myIntList + " size is " + myIntList.size());
		myIntList.set(2, -56);
		System.out.println(myIntList + " size is " + myIntList.size());
		myIntList.remove(1);
		myIntList.set(3,29);
		System.out.println(myIntList + " size is " + myIntList.size());
		System.out.println("Tenth Item "+myIntList.get(10));
		System.out.println("100? " + myIntList.contains(100));
		System.out.println("where is 13? " + myIntList.indexOf(13));
		for(int i = 0; i<5; i++){
			myIntList.remove(i);
		}

		System.out.println(myIntList + " size is " + myIntList.size());

	}
}
