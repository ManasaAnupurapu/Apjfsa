package com.apjfsa;

import java.util.Scanner;

public class StringDuplicate {

	public static void main(String args[]) {
		int count = 0;
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		char arr[] = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate value:"+arr[i]);
					count++;

				}
			}
		}

		System.out.println(count);

	}

}
