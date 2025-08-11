//package largestElement;
//
//
//
//public class Largestelement {
//	public static void main(String[] args)
//	{	int j=0;
//	int temp;
//		int arr[]= {10,49,20,58,37,94,280,8374};
//	
//		for(int i=0; i<arr.length-1; i++)
//		{
//			for( j=i+1; j<arr.length-1; j++)
//			{
//				if(arr[i]>arr[j])
//				{
//		           temp=arr[i];
//		           arr[i]=arr[j];
//		           arr[j]=temp;
//				}
//			}
//		}
//		System.out.println(arr[j]-arr.length);
//		}
//	}
//
package largestElement;

public class Largestelement {
    public static void main(String[] args) {
        int temp;
        int j=0;
        int arr[] = {10, 49, 20000, 58, 37, 94, 280, 8374};

        for (int i = 0; i < arr.length; i++) {
            for ( j= i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Largest element: " + arr[arr.length - 1]);
        System.out.println("Largest element : "+ arr[--j]);
    }
}
