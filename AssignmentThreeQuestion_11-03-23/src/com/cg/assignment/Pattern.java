package com.cg.assignment;
import java.util.*; 
public class Pattern {
			public static void printPattern(int n) 
			{ 
				int i, j; 
				 
				for (i = 0; i < n; i++) { 
					
					for (j = n - i; j > 1; j--) { 
						System.out.print(" "); 
					} 
					for (j = 0; j <= i; j++) { 
						System.out.print("* "); 
					} 
					System.out.println(); 
				} 
			} 
			public static void main(String args[]) 
			{ 
				Scanner sc1=new Scanner(System.in);
				System.out.println("Enter Number of rows you want :");
				int n = sc1.nextInt(); 
				printPattern(n); 
			} 
		


	}


