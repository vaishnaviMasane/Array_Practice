package com;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
   int arr[]= {10,20,30,40,50};
 System.out.println(Arrays.toString(arr));
     int i=0;
     int j=arr.length-1;
     while(i!=j)
     {
    	 int temp=arr[i];
    	 arr[i]=arr[j];
    	 arr[j]=temp;
    	 i++;
    	 --j;
     }
     
   System.out.println(Arrays.toString(arr));
	}
	

}
