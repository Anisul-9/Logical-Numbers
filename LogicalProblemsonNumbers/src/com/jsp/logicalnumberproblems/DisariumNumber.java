package com.jsp.logicalnumberproblems;

public class DisariumNumber {
	
	public static void isDisariumNumber(int n) {
	int temp=n;	int sum=0; int count=0;
		
		while(n>0) {
			n=n/10;
			count ++;
		}
		  temp=n;
		 
		 while(temp>0) {
			 int ld=n%10;
			 
			 int pro=1;
			 for(int i=1;i<=count;i++) {
				 pro=ld*pro;
			 }
			 sum=sum+pro;
			 temp=temp/10;
			 count--;
		 }
		 if(sum==n) {
			 System.out.println("it is a disarium no");
		 }
		 else {
			 System.out.println("Not a disarium number");
		 }
		}
	
	public static void main(String[] args) {
		
		isDisariumNumber(0);
		
	}
	}



