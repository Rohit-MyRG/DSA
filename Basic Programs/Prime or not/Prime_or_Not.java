// Q. To Check The number is prime or not.
// "The number which devisible by 1 and itself only is called prime number."
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Prime_or_not
{
	static boolean isPrime(int num)
	{
		for(int i=2; i<=(num/2); i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter the Number: ");
		int num = Integer.parseInt(br.readLine());

		if(isPrime(num))
			System.out.println("Number is prime...");
		else
			System.out.println("Number is not prime...");
	}
}
// Time Complexity is: O(n/2)