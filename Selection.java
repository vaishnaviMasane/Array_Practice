package com.selection;

import java.util.Arrays;

public class Selection {
public void sort_Array(int arr[])
{for(int i=0; i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
	
}
	public static void main(String[] args) {
		int arr[]= {30,70,50,400,40};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
//		for(int i=0; i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]>arr[j])
//				{
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
		Selection sel=new Selection();
	sel.sort_Array(arr);
		System.out.println("After Sorting ");
		System.out.println(Arrays.toString(arr));
	}

}
