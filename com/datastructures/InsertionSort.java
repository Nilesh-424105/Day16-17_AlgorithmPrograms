package com.datastructures;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements you want in the array: ");
		int count = sc.nextInt();

		// Declare and assigning array
		int number[] = new int[count];
		System.out.println("Enter array elements:");
		for (int i = 0; i < count; i++) {
			number[i] = sc.nextInt();
		}
		sc.close();
		Sorting sort = new Sorting();
		sort.bubbleSort(number);
	}

}
