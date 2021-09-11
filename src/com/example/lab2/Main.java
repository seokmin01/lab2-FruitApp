package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		
		list.add(new Fruit(101, "Coconut", 1500));
		list.add(new Fruit(102, "Fig", 2000));
		list.add(new Fruit(103, "Apple", 1200));
		list.add(new Fruit(104, "Grapes", 3000));
		list.add(new Fruit(105, "Lemon", 1700));
		list.add(new Fruit(106, "Pineapple", 5000));
		list.add(new Fruit(107, "Kiwi", 2500));
		list.add(new Fruit(108, "Orange", 1400));
		list.add(new Fruit(109, "Pear", 2100));
		list.add(new Fruit(110, "Banana", 2400));
		list.add(new Fruit(111, "Cherry", 2300));
		list.add(new Fruit(112, "Strawberry", 1900));
		
		//오름차순 정렬
		System.out.println("Fruit List (ordered by name)");
		Collections.sort(list, new FruitComparator());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		System.out.println();
		//내림차순 정렬
		System.out.println("Fruit List (reverse ordered by name)");
		Collections.sort(list, new FruitComparatorDesc());
		for (Fruit ss : list) {
			System.out.println(ss.toString());
		}
		
	}
	
}
