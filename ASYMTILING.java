import java.util.Scanner;

public class ASYMTILING {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long[] a = new long[101];
		long modular = 1000000007;
		
		a[1] = 1;
		a[2] = 2;
		
		for(int i= 3; i <= 100; i++)
		{
			a[i] = ( a[i-1]   + a[i-2] ) % modular;
		}
		
		int c, n;
		
		c = sc.nextInt();
		
		for(int i = 0; i < c; i++)
		{
			n = sc.nextInt();
			
			long result;
			
			if(n == 2) result = 0; 
			else if(n % 2 == 1) result = ( a[n] - a[n/2] + modular ) % modular;
			else
			{
				result = a[n];
				result = ( result - a[n/2] + modular ) % modular;
				result = ( result - a[n/2-1] + modular ) % modular;
			}
			
			System.out.println(result);
		}	
	}
}
