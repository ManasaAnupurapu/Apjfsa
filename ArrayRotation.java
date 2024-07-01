//Program to demonstrate rotating of an array
package com.apjfsa;
//Class Declaration
public class ArrayRotation {
	//Main method declaration
	public static void main(String args[]) {
		//Initializing an array
		int arr[]= {1,3,5,7,9,11};
		int n= arr.length;//intializing n with length of an array
		int temp= arr[n-1];//creating a temp and intialising it with last element in array
		//Logic to rotate an array
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[0]=temp;
		//Printing all elements of an array after rotation
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
		}
			
	}

}
