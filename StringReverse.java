//Program to reverse a string using a String class
package com.apjfsa;
//Package to import Scanner class
import java.util.Scanner;
//Class Declaration
public class StringReverse {
    //Main Method
	public static void main(String[] args) {
		//To read input from scanner
		Scanner sc = new Scanner(System.in);
		//Print statement to take input from user
		System.out.println("Enter a String");
		String s = sc.next();//storing input in s
		char arr[] = s.toCharArray();//converting string to a array
		//To print a string in reverse order
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(arr[i]);

		}

	}

}
