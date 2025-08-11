package com;

import java.util.Arrays;

public class DuplicateArray {
public static void main(String[] args) {
	int arr[]= {10,10,20,20,30,30,40,40,50,60};
	int index=0;
	arr[index++]=arr[0];
	for(int i=1; i<arr.length; i++)
	{
		if(arr[i]!=arr[i-1])
		{
			arr[index++]=arr[i];
		}
	}
	System.out.println("Remove duplicate" +Arrays.toString(Arrays.copyOf(arr, index)));
}
}
