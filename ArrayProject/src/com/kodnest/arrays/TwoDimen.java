package com.kodnest.arrays;
import java.util.Scanner;
public class TwoDimen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][] a=new int[2][5];
		
		/*a[0][0]=20;
		a[0][1]=30;
		a[0][2]=40;
		a[0][3]=50;
		a[0][4]=60;
		
		a[1][0]=35;
		a[1][1]=40;
		a[1][2]=65;
		a[1][3]=76;
		a[1][4]=85;
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the total no of classes");
		int m=scan.nextInt();
		
		System.out.println("enter the no of student");
		int n=scan.nextInt();
		
		int [][] a=new int[m][n];
		System.out.println("rnter "+(m*n)+" student marks");
		
		
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				
				a[i][j]=scan.nextInt();
			}
			
			
		}
		
		System.out.println("the marks are ");
		for(int i=0;i<=a.length-1;i++) {
			for(int j=0;j<=a[i].length-1;j++) {
				System.out.println(a[i][j]);
			}
			
		}
		
		
		
	}

}
