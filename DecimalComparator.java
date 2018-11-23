package com.source;

public class DecimalComparator {
	public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {
		boolean isEqual = false;
		int numOne = (int) (d1*1000);
		int num2 = (int) (d2*1000);
		if(numOne == num2) {
			isEqual = true;
			return isEqual;
		}
		return isEqual;
	}
	
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
	}
}
