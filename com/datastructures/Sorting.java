package com.datastructures;

public class Sorting {

	// sorting
	public static void sort(String[] string) {
		int length = string.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (string[j].compareTo(string[j - 1]) < 0) {
					String temp = string[j];
					string[j] = string[j - 1];
					string[j - 1] = temp;
				}
			}
		}
	}

	// To Print After Sorting Array
	public static void printStringArray(String str[]) {
		int n = str.length;
		for (int i = 0; i < n; i++)
			System.out.println(str[i]);
	}
}
