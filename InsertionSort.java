package sorting;

import java.util.Scanner;

public class InsertionSort {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size : ");
	int size=sc.nextInt();
	System.out.println("Enter the array elements  : ");
	int arr[]=new int[size];
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for(int i=1;i<arr.length;i++)
	{
		int key=arr[i];
		int j=i-1;
		
		while(j>=0 && key<arr[j])
		{
			arr[i+1]=arr[j];
			j--;
			arr[j+1]=key;
		}
		
	}
	
}

}
