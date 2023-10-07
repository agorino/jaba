/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s4;

/**
 * Exercise on two-dimensional array
 */
public class MatrixExercise {
	/**
	 * <ol>
	 * <li>Create a two line matrix
	 * <ul>
	 * <li>Row 1: "ciao", "buongiorno"
	 * <li>Row 2: "hello", "good morning"
	 * </ul>
	 * <li>Print the first English greeting
	 * <li>Convert the Italian greetings in a string and print it
	 * <li>Convert the full matrix in a string and print it
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// TODO
		System.out.println("todo 1");
		String[][] a = { { "ciao", "buongiorno" }, { "hello", "good morning" } };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[1][i]);
		}
		System.out.println("todo 2");
		String[] b = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[0][i];
			System.out.println(b[i]);
		}
		System.out.println("todo 3");
		String[] c = new String[a.length * 2];

		for (int i = 0; i < b.length; i++) {
			c[i] = b[i];
		}
		int f = 2;
		for (int i = 0; i < a.length; i++) {
			c[f] = a[1][i];
			f++;
		}

		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}

		System.out.println("Done");
	}
}
