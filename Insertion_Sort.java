package com.insertion_sort;

import java.util.Arrays;

public class Insertion_Sort {
public void sort_array(int arr[])
{
   for(int i=1;i<arr.length;i++)
   {
	  int j=i-1; int key=arr[i];
	  while(j>=0&&key<arr[j])
	  {
		  arr[j+1]=arr[j];
		  j--;
	  }
	  arr[j+1]=key;
   }
}
	public static void main(String[] args) {
		Insertion_Sort sort=new Insertion_Sort();
  int arr[]= {50,70,100,90,20,40,80,10,30,60};
  sort.sort_array(arr);
  System.out.println(Arrays.toString(arr));
	}

}
