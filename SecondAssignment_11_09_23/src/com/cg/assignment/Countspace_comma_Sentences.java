package com.cg.assignment;

import java.util.Scanner;

public class Countspace_comma_Sentences {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the text:");
	        String text = sc.nextLine();
	        int sentenceCount = 0;
	        int spaceCount = 0;
	        int commaCount = 0;
	        for (int i = 0; i < text.length(); i++) {
	            char ch = text.charAt(i);
	            if (ch == '.' || ch == '?' || ch == '!') {
	                sentenceCount++;
	            } else if (ch == ' ') {
	                spaceCount++;
	            } else if (ch == ',') {
	                commaCount++;
	            }
	        }
	        System.out.println("The total number of sentences is: " + sentenceCount);
	        System.out.println("The total number of spaces is: " + spaceCount);
	        System.out.println("The total number of commas is: " + commaCount);
	    }
}