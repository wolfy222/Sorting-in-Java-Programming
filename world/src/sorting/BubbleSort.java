/*
 * Bubble Sort - It is a simple sorting algorithm that repeatedly steps through the list, 
 * compares adjacent elements and swaps them if they are in the wrong order. 
 * The pass through the list is repeated until the list is sorted.
 */

package sorting;

import java.util.Scanner;

public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the size of the array - ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array - ");
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < (n-1) ; i++)
		{
			for(int j = 0 ; j < (n-i-1) ; j++)
			{
				if(arr[j+1] < arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("The sorted array is - ");
		for(int item : arr)
		{
			System.out.print(item + " ");
		}
	}
}
