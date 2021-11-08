package com.datastructures;

import java.util.Arrays;

public class BinarySearchWord {

	public static void main(String[] args) {

		// creating and assigning String Array
		String[] str = { "Apple", "Mango", "Lemon", "Banana", "Orange" };
		System.out.println("Before sorting:" + Arrays.toString(str));

		// To sort word
		Sorting sorting = new Sorting();
		String[] str1 = sorting.sort(str);
		System.out.println("After sorting:" + Arrays.toString(str1));

		// to search word which is in which index
		String search = "Orange";
		Searching searching = new Searching();
		int result = searching.binarySearch(str1, search);

		if (result == -1)
			System.out.println(search + " = Word not present in String");
		else
			System.out.println(search + " = Word found in String at index: " + result);

	}

}
