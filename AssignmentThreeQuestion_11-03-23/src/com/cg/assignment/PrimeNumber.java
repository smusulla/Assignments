package com.cg.assignment;
import java.io.*;
import java.util.Scanner;
public class PrimeNumber {
	
	

	

		static int i = 2;

		public static boolean isPrime(int n)
		{

			
			if (n == 0 || n == 1) {
				return false;
			}

		
			if (n == i)
				return true;

			
			if (n % i == 0) {
				return false;
			}
			i++;
			return isPrime(n);
		}

		
		public static void main(String[] args)
		{
			Scanner sc1=new Scanner(System.in);
			System.out.print("Enter a number : ");
			int n=sc1.nextInt();
			if (isPrime(n)) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
	}

