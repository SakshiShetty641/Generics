package com.bridgelabz;
/**
 * Purpose - To find maximum value using generics
 * @author - Sakshi Shetty
 * @version - 8.0
 * @since - 2021-08-17
 */
public class FindMaxValue {

	/**
	 * Generic method to compare any type of data and find maximum
	 * @param a1 : First value to compare
	 * @param a2 : Second value to compare
	 * @param a3 : Third value to compare
	 * @return max : Maximum of three values
	 */
	public static <T extends Comparable<T>> T maxOfValues(T a1, T a2, T a3) {
		T max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the program to find maximum value using generics");
		Integer a1 = 20, a2 = 8, a3 = 12;
		System.out.println("The Maximum between three integers is : " + maxOfValues(a1, a2, a3));
		Float f1 = 1.5f, f2 = 8.2f, f3 = 6.4f;
		System.out.println("The Maximum between three float is : " + maxOfValues(f1, f2, f3));
		String s1 = "abc", s2 = "pqr", s3 = "xyz";
		System.out.println("The Maximum between three float is : " + maxOfValues(s1, s2, s3));
	}
}
