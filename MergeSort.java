package sorting;

import java.util.Scanner;

public class MergeSort {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size : ");
	int size=sc.nextInt();
	System.out.println("Enter the array elements : ");
	int arr[]=new int[size];
	int n=arr.length;
	
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	divide(arr,0,n-1);
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
}

private static void divide(int[] arr, int si, int ei) {
	
	if(si>=ei)
	{
		return;
	}
	
	int mid=si+(ei-si)/2;
	divide(arr,si,mid);
	divide(arr,mid+1,ei);
	conquer(arr,si,mid,ei);
}

private static void conquer(int[] arr, int si, int mid, int ei) {
	
	int merged[]=new int[ei-si+1];
	
	int idx1=si;
	int idx2=mid+1;
	int x=0;
	
	while(idx1<=mid && idx2<=ei)
	{
		if(arr[idx1]<=arr[idx2])
		{
			merged[x]=arr[idx1];
			x++;
			idx1++;
		}
		else
		{
			merged[x]=arr[idx2];
			x++;
			idx2++;
		}
	}
	while(idx1<=mid)
	{
		merged[x++]=arr[idx1++];
	}
	while(idx2<=ei)
	{
		merged[x++]=arr[idx2++];
	}
	for(int i=0,j=si;i<merged.length;i++,j++)
	{
		arr[j]=merged[i];
	}
}
}
