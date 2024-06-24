package com.apjfsa;

public class ArrayRotation {
	public static void main(String args[]) {
		int arr[]= {1,3,5,7,9,11};
		int n= arr.length;
		int temp= arr[n-1];
		
		for(int i=n-1;i>0;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[0]=temp;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
			
		}
			
	}

}
