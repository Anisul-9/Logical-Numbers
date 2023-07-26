package com.jsp.logicalnumberproblems;

public class NeonNumber {
	
	public static void isneonNumber(int n) {
		int sum=0;
		int square=n*n;
		while(square>0) {
			int ld=square%10;
			
			 sum =sum+ld;
			square=square/10;
		}
		if(sum==n) {
			System.out.println("It is a neon number");
		}
		else {
			System.out.println("it is not a neon number");
		}
		
		
	}
	
	public static void main(String[] args) {
		isneonNumber(6);
	}

}
