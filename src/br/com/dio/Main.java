package br.com.dio;

import br.com.dio.model.Cat;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("Tinha", "Gray", 10);
		System.out.println("Hello " + cat.getName());
	}
}
