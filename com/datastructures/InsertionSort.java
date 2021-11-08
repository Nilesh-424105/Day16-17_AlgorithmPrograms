package com.datastructures;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String args[]) {
		InputString array = new InputString();
		String[] string = array.inputTheString();
		System.out.println("Array after sorting");
		Sorting sorting = new Sorting();
		sorting.sort(string);
		sorting.printStringArray(string);

	}

}
