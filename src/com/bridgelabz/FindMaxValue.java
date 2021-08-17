package com.bridgelabz;
/**
 * Purpose - To find maximum value using generics
 * @author - Sakshi Shetty
 * @version - 8.0
 * @since - 2021-08-17
 */
public class FindMaxValue {

	/**
	 * Method used to compare three integer values and get the maximum value.
	 * @param a1 : First value to compare
	 * @param a2 : Second value to compare
	 * @param a3 : Third value to compare
	 * @return max : Maximum of three integers
	 */
	public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3) {
		Integer max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	/**
	 * Method to compare three float values and get the maximum value.
	 * @param f1 : First value to compare.
	 * @param f2 : Second value to compare.
	 * @param f3 : Third value to compare.
	 * @return max : Maximum of three float
	 */

	public static Float maxOfFloat(Float f1, Float f2, Float f3) {
		Float max = f1;
		if (f2.compareTo(max) > 0)
			max = f2;
		if (f3.compareTo(max) > 0)
			max = f3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the program to find maximum value using generics");
		Integer a1 = 20, a2 = 8, a3 = 12;
		System.out.println("The Maximum between three integers is : " + maxOfInteger(a1, a2, a3));
		Float f1 = 1.5f, f2 = 8.2f, f3 = 6.4f;
		System.out.println("The Maximum between three float is : " + maxOfFloat(f1, f2, f3));
	}
}
