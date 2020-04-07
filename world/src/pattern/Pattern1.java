/*
 * Pattern 1-
 * 
 *  *****
 *  *****
 *  *****
 *  *****
 *  *****
 *  
 *  For the value of n=5
 */

package pattern;
import java.util.*;

public class Pattern1
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n ");
		int n=sc.nextInt();
		System.out.println("Required Pattern - ");
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
