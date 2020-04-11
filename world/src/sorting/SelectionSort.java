/*
 * Selection Sort - This sorting algorithm is an in-place comparison-based algorithm in which the list is 
 * divided into two parts, the sorted part at the left end and the unsorted part at the right end.
 * Initially, the sorted part is empty and the unsorted part is the entire list.
 *
 */

package sorting;

import java.util.Scanner;

public class SelectionSort
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
			int minIndex = i;
			for(int j = i ; j < n ; j++)
			{
				if(arr[j] < arr[minIndex])
				{
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.println("The sorted array is - ");
		for(int item : arr)
		{
			System.out.print(item + " ");
		}
	}
}
