package com.jsp.logicalnumberproblems;

public class Factorial {
	 public static int isFactorial(int n) {
		 
		 int pro=1;
		 for(int i=0;i<=n;i++) {
			 pro=pro*i;
		 }
		 return pro;
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println(isFactorial(5));
	}

}
