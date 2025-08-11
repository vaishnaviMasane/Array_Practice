package com;

import java.util.Arrays;

public class Largest {

	public static void main(String[] args) {
		int arr[]= {30,70,20,50,400,40};
		//To Printing a Array
//		System.out.println(Arrays.toString(arr));
//		for(int num:arr)
//		{
//			System.out.println(num+ "");
//		}
//
		int largest=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println("Largest number is : " +largest);
}

}
