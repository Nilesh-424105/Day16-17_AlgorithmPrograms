package com.datastructures;

public class Sorting {

	// sorting
	public static String[] sort(String[] str) {
		// temp variable declare
		String temp;
		// this for loop iterate whole element in array
		for (int i = 0; i < str.length; i++) {

			for (int j = 0; j < str.length - 1 - i; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) {
					// swapping element
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
		return str;
	}

}
