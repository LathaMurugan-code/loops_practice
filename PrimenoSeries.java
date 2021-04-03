	package practice;

public class PrimenoSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int maxcount = 100;
		int prime =0;
		boolean isprime = true;
		while(i<=maxcount)
		{
			isprime = findPrimeno(i);
			if(isprime)
			{
				System.out.println("prime"+i);
				prime++;
				if(prime==10)
					break;
			}
			i++;
		}
		

	}

	public static boolean findPrimeno(int numbercheck) {
		// TODO Auto-generated method stub
		int i=2;
		int remainder;
		while(i<=numbercheck/2)
		{
			remainder = numbercheck%i;
			if(remainder==0)
			{
				return false;
			}
			i++;
		
		}
		return true;
	}

}
