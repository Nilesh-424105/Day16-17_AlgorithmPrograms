package com.datastructures;

public class Recursive {

	// method for string permutations using recursive approach
	public static void recursivePermutation(String string, int start, int end) {
		if (start == end) {
			System.out.print(string + " ");
		} else {
			for (int i = start; i <= end; i++) {
				string = swap(string, start, i);
				recursivePermutation(string, start + 1, end);
			}
		}
	}

	private static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
