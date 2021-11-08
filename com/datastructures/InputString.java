package com.datastructures;

import java.util.Scanner;

public class InputString {

	// Input String given by user
	public static String[] inputTheString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of String Array");
		int size = scanner.nextInt();
		scanner.nextLine();
		String[] stringArray = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Array[" + i + "] element");
			String string = scanner.nextLine();
			stringArray[i] = string;
		}
		return stringArray;
	}

}
