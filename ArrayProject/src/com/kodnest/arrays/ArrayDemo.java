package com.kodnest.arrays;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) {
		
		System.out.println("user! enter size of an array");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] a=new int[size];
		
		System.out.println("user! please enter "+size+"elements");
		for(int i=0;i<+size-1;i++) {
			a[i]=scan.nextInt();
			
		}
		for(int i=0;i<size-1;i++) {
			System.out.println(a[i]);
		}
	}

}
