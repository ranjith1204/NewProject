package com.kodnest.arrays;
import java.util.Scanner;
public class CharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter n value");
	int n=scan.nextInt();
	
	char ch[]=new char[n];
	char temp[]=new char[n];
	
	System.out.println("enter 5 characters");
	for(int i=0;i<ch.length;i++) {

		ch[i]=scan.next().charAt(0);
		
	}
	System.out.println("copying the elements in reverse order");
	for(int i=n-1;i>=0;i--) {
		
		temp[i]=ch[i];
	
		System.out.println(temp[i]);
	}
	System.out.println("display the elements in normal order");
	for(int i=0;i<n;i++) {
	System.out.println(temp[i]);
	}
	
	}
}
