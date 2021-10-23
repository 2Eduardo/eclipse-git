package br.com.dio.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;

		System.out.println("Type two values");
		a = scan.nextInt();
		b = scan.nextInt();
		scan.close();

		System.out.println(a + " + " + b + " = " + sum(a, b));
		System.out.println(a + " - " + b + " = " + sub(a, b));
		System.out.println(a + " * " + b + " = " + mult(a, b));
		System.out.println(a + " \\ " + b + " = " + div(a, b));
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mult(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		return a / b;
	}
}
