package com.npci.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Implementation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		List<String> arrList = new ArrayList<String>();
		arrList.add("C");
		arrList.add("C++");
		arrList.add("Java");
		arrList.add("Python");
		
		System.out.println("Size of ArrayList: " + arrList.size());
		System.out.println("ArrayList isEmpty: " + arrList.isEmpty());
		System.out.println("Enter index to get the element(0 to " + (arrList.size()-1) +"):");
		int index = in.nextInt();
		System.out.println("ArrayList at index " + index + ": " + arrList.get(index));
		arrList.set(3, "Python3");
		System.out.println(arrList);
		
		List<String> arrList1 = new ArrayList<String>();
		arrList1.add("R");
		arrList1.add("MySQL");
		arrList1.add("save");
		arrList1.add("vase");
		
		arrList.addAll(arrList1);
		System.out.println(arrList);
		
		List<String> anagramList = new ArrayList<>();
		
		for(int i = 0; i < arrList.size()-1; i++) {
			for(int j = i+1; j < arrList.size(); j++) {
				char preString[] = arrList.get(i).toCharArray();
				Arrays.sort(preString);
				char nextString[] = arrList.get(j).toCharArray();
				Arrays.sort(nextString);
				if(new String(preString).equals(new String(nextString))) {
					anagramList.add(arrList.get(i));
					anagramList.add(arrList.get(j));
				}
			}
		}
		
		System.out.println(anagramList);
		
		arrList1.add("GoLang");
		
		Set<String> set1 = new HashSet<>();
		set1.addAll(arrList);
		
		Set<String> set2 = new HashSet<>();
		set2.addAll(arrList1);
		
		Set<String> intersectionSet = new HashSet<String>(set1);
		intersectionSet.retainAll(set2);

		System.out.println("Set 1: " + set1);
		System.out.println("Set 2: " + set2);
		System.out.println("Intersection Set: " + intersectionSet);
	}
}
