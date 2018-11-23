package com.source;

public class EqualSumChecker {
	public static boolean hasEqualSum(int param1, int param2, int param3) {
//		boolean isEqual = false;
//		int result = param1+param2;
//		if(param3 == result) {
//			isEqual = true;
//			return isEqual;
//		}
//		return isEqual;
		return param1+param2 == param3;
	}
	
	public static void main(String[] args) {
		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));
		System.out.println(hasEqualSum(1, -1, 0));
	}

}
