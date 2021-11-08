package com.datastructures;

public class MergeSort {

	public static void main(String args[]) {
		String[] stringArray = { "Sat", "Panda", "Sun", "Dog", "Cat", "Mango", "Joker", "India" };
		Sorting sort = new Sorting();
		sort.mergeSort(stringArray);
		for (String string : stringArray) {
			System.out.println(string);
		}
	}

}
