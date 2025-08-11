package unsorted;

import java.util.Arrays;

public class Duplicate_Unsorted {
	public void sorted_Array(int arr[])
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
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
	Duplicate_Unsorted duplicate=new Duplicate_Unsorted();
	int arr[]= {30,400,30,70,70,50,400,40};
	duplicate.sorted_Array(arr);
	System.out.println("Sorted Array : " +Arrays.toString(arr));
	int new_array[]=new int[arr.length];
	int index=0;
	new_array[index++]=arr[0];
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]!=arr[i-1])
		{
			new_array[index++]=arr[i];
		}
	}

	
	int unique[]=Arrays.copyOf(new_array, index);
	System.out.println("Remove the Duplicate in array : "+Arrays.toString(unique));
}
}
