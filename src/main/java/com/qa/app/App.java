package com.qa.app;

import com.qa.calc.Calculator;

public class App {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int sum = calc.add(2, 2);
	
		
		System.out.println("The answer to 2 + 2 = " + sum);
		
		int sum2 = calc.subtract(4,2);
		System.out.println("The answer to 4 - 2 = " + sum2);

	}

}
