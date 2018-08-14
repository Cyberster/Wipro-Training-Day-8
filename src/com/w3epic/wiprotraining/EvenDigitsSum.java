package com.w3epic.wiprotraining;

public class EvenDigitsSum {
	public static int getEvenDigitsSum(int input1) {
	    int sum = 0;
		
		while (input1 != 0) {
			int digit = input1 % 10;
			if (digit % 2 == 0) sum += digit;
			input1 /= 10;
		}
		
		return sum;
	}
}
