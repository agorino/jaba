/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s2;

/**
 * Branch in code execution by checking conditions
 */
public class Exercises {
	public static void main(String[] args) {
		int a = 23;
		int b = 42;
		int c = 23;

		System.out.println("The sum of the three variables is " + (a + b + c));

		// TODO: compare a, b, and c to print the largest value
		if (a >= b && a >= c) {
			System.out.println("The largest value is ... " + a);
		} else if (b >= a && b >= c) {
			System.out.println("The largest value is ... " + b);
		} else if (c >= a && c >= b) {
			System.out.println("The largest value is ... " + c);
		}

		// TODO: compare a, b, and c to print ONE of the two alternative strings:
		// System.out.println("[The values are not repeated / A value is repeated ...
		// ]");
		if (a == c || a == b || c == b) {
			System.out.println("A value is repeated");
		} else {
			System.out.println("The values are not repeated ");
		}

		/*
		 * // TODO: compare a, b, and c to print ONE of the three alternative strings:
		 * System.out.
		 * println("The value in a is [greater than / less than / equal to] b");
		 */
		if (a < b) {
			System.out.println("The value in a is less than b");

		} else if (a == b) {
			System.out.println("The value in a is equal to b");

		} else {
			System.out.println("The value in a is greater than b");
		}
	}
}
