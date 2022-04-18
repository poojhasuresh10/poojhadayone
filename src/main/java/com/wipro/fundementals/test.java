package com.wipro.fundementals;
import java.util.Scanner;
public class test {
	public static void main(String[] xyz) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int numberOne=scan.nextInt();
		if(numberOne%2==0) {
			System.out.println(numberOne+ "is even");
			}
		else {
			System.out.println(numberOne + "is odd");
		}
		System.out.println("------------------");
		System.out.println("enter number 2");
		int numberTwo=scan.nextInt();
		if(numberOne>numberTwo) {
			System.out.println(numberOne + "is greater than"+numberTwo);
		}
		else {
			System.out.println(numberTwo+ "is greater than"+numberOne);
			
		}
		System.out.println("------------");
		char str='p';
		if(str>='A' && str<='Z') {
			System.out.println("upper case");
			}
		else if(str>='a' && str<='z') {
			System.out.println("lower case");
		}
		else 
		{
			System.out.println("not a char");
		}
	}

}
