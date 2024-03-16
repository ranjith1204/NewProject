package com.kodnest.arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] a= {10,17,40,14,30};
		int ele=14;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) {
			if(ele==a[i]) {
				flag=true;
				break;
			}
			else {
				flag=false;
			}
			
		}
		
		if(flag==true) {
			System.out.println("is present");
		}
		else {
			System.out.println("is not present");
		}
		}
}
