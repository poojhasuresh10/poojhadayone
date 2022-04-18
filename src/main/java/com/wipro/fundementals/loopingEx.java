package com.wipro.fundementals;

public class loopingEx {
	public static void main(String[] args) {
		for(int i=1;i<10;i=i+1) {
			System.out.println(i);
		}
		int mul=1;
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
			mul=mul*i;
		}
		System.out.println("sum" + sum+"mul"+mul);
	}
   
}
