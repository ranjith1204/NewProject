package com.kodnest.twodarray;
import java.util.Scanner;
public class TwoDArrayDemo {
	public static void main(String[] args) {
		int [][] a=new int [2][2];
		int [][] b=new int [2][2];
		
		int [][] c=new int [2][2];
		
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=scan.nextInt();
				
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				a[i][j]=scan.nextInt();
				
			}
		}
		
	}

}
