package com.kodnest.arrays;
import java.util.Scanner;
public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter n value");
		int n=scan.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter values");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
			
		}
		int j=0;
		int k=0;
		for(int i=0;i<n;i++) {
		int temp;	
		 //temp[(i+k)%n]=arr[i];
	
			
		}
		for(int i=0;i<arr.length;i++)
		
		System.out.println(arr[i]);
		
	}

}
