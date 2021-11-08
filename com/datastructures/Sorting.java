package com.datastructures;

public class Sorting {

	// Bubble sorting
	public static void bubbleSort(int array[]) {
		int length = array.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		// Print Elements After Sorting
		System.out.println("Array Elements after sorting: ");
		for (int i = 0; i < length; i++) {
			System.out.println(array[i]);
		}
	}

}
