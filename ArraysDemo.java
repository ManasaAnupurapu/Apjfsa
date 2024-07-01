//Program to search an element from an array
package com.apjfsa;
//Class Declaration
public class ArraysDemo {
	//Main method declaration
	public static void main(String args[]) {
	//Intializing an array	
	int[] arr= {23,56,83,33,32};
	//intializing boolean b with false	
	boolean b= false;
	//Variable Declaration	
	int num= 86,i;
	//Loop to check gor the element in the array	
	for( i=0;i<arr.length;i++) {
		if(num== arr[i]) {
			System.out.println("Number found");
			b = true;
			break;
		}
			
	}
	if(!b)
	
		System.out.println("Number not found");
		}
			
}
	

