package com.datastructures;

import java.util.Arrays;

public class PermutationsOfString {

	public static void main(String[] args) {

		String string = "ABC";
		int n = string.length();
		// calling iterative method
		System.out.println("Permuatation using Iterative method");
		Iterative find = new Iterative();

		find.iterativePermutation(string);

		System.out.println("");

		// calling recursive method
		System.out.println("Permuatation using Recursive method");
		Recursive permute = new Recursive();
		permute.recursivePermutation(string, 0, n - 1);
	}

}
