package com.apjfsa;

public class ArraysDemo {
	public static void main(String args[]) {
	int[] arr= {23,56,83,33,32};
	boolean b= false;
	int num= 86,i;
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
	

