package com.w3epic.wiprotraining;

public class DigitSum {
	public static int getDigitSum (int input1) {
		int sum = 0;//getSumOfDigits(input1, 0);
		int digitCount = String.valueOf(input1).length();
		int number = input1;
		if (input1 < 0) number *= -1;
		
		if (digitCount == 1) sum = number;
		
		while (digitCount != 1) {
			//sum = getSumOfDigits(input1);
			int currentSum = 0;
			while (number != 0) {
				currentSum += number % 10;
				number /= 10;
			}
			sum = currentSum;
			
			digitCount = String.valueOf(sum).length();
			number = sum;
		    //System.out.println(input1);
		}
		
		if (input1 < 0) sum *= -1;
		
		return sum;
	}
	
//	static int getSumOfDigits(int no) {
//		int sum = 0;
//
//		while (no != 0) {
//			sum += no % 10;
//			no /= 10;
//		}
//
//		return sum;
//	}
	
	public static void main(String[] args) {
		//System.out.println(DigitSum.getDigitSum(8));
		for (int i = 101; i < 110; i++) {
			System.out.println(DigitSum.getDigitSum(i));
		}
	}
}
