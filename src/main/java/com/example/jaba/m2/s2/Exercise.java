/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m2.s2;

/**
 * A very simple exercise in three steps on array
 */
public class Exercise {
	/**
	 * @param args not used
	 */
	public static void main(String[] args) {
		// TODO
		// <li>(1) create an array with "one", "two", "three", "four" in it
		String[] a= {"one","two","three","four"};
		// <li>(2) print the number of its elements
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		// <li>(3) print the last element
		System.out.println(a[a.length-1]);
		System.out.println("Done");
	}
}
