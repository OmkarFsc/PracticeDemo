package sorting;

import java.util.Scanner;

public class SelectionSort {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size : ");
	int size=sc.nextInt();
	System.out.println("Enter the array elements  :");
	int arr[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++)
	{
		int smallest=i;
		
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[smallest]>arr[j])
			{
				smallest=j;
			}
		}
		int temp=arr[smallest];
		arr[smallest]=arr[i];
		arr[i]=temp;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
}
}
