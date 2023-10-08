/*
 * Introduction to Java base concepts
 * 
 * https://github.com/egalli64/jaba
 */
package com.example.jaba.m4.s4;

/**
 * Branch in code execution switching on a condition
 */
public class Exercises {
	public static void main(String[] args) {
		int a = 42;
		int b = 7;

		char op = '*';

		if (op == '+') {
			System.out.println("The sum of a and b is " + (a + b));
		}
		String Op = "" + op;
		// TODO: switch on op for '+', '-', '/', '*' to operate on a and b
		switch (Op) {
		case "+":
			System.out.println("The sum of a and b is ... " + (a + b));
			break;
		case "-":
			System.out.println("The subtraction of a and b is ... " + (a - b));
			break;
		case "/":
			System.out.println("The division of a and b is ... " + (a / b));
			break;
		case "*":
			System.out.println("The product of a and b is ... " + (a * b));
			break;
		default:
			System.out.println("I don't understand");
			break;
		}

		// TODO: same, but use an enum for the operation instead of a char
		
		operatori z= operatore();
		
		switch (z) {
		case addizione:
			System.out.println("The sum of a and b is ... " + (a + b));
			break;
		case sottrazione:
			System.out.println("The subtraction of a and b is ... " + (a - b));
			break;
		case divisione:
			System.out.println("The division of a and b is ... " + (a / b));
			break;
		case moltiplicazione:
			System.out.println("The product of a and b is ... " + (a * b));
			break;
		default:
			System.out.println("I don't understand");
			break;
		}
		

	}
	
	
	private static operatori operatore() {
        operatori[] m = operatori.values();
        return m[(int) (Math.random() * m.length)];
    }
}
