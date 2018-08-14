package com.w3epic.wiprotraining;

public class EvenOddDigitsSum {
	public static int getEvenOddDigitsSum(int input1, String input2) {
		int evenSum = 0;
		int oddSum = 0;
		
		while (input1 != 0) {
			int digit = input1 % 10;
			
			if (input2.equals("even") && digit % 2 == 0) evenSum += digit;
			if (input2.equals("odd") && digit % 2 == 1)	oddSum += digit;
			
			input1 /= 10;
		}
		
		if (input2.equals("even")) return evenSum;
		else return oddSum;
	}
}
