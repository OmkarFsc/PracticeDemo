package sorting;

import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size : ");
	int size=sc.nextInt();
	System.out.println("enter the array elements ");
	int arr[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+ " ");
	}
	
}
}
