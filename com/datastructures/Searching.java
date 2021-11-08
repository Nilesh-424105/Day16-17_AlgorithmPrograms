package com.datastructures;

public class Searching {

	// Binary search method to search word
	public static int binarySearch(String[] str1, String search) {

		int start = 0, size = str1.length - 1;
		while (start <= size) {
			int mid = start + (size - start) / 2;
			int res = search.compareTo(str1[mid]);

			// Check if search word is present at mid
			if (res == 0)
				return mid;

			// If search word greater, ignore left half
			if (res > 0)
				start = mid + 1;

			// If search word is smaller, ignore right half
			else
				size = mid - 1;
		}
		return -1;
	}

}
