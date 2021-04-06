public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrongNumber sn = new StrongNumber();
		
		int n = 44;
		int temp;
		int r;
		int fact = 0;
		temp = n;
		
		while(n>0)
		{
		r=n%10;
		fact=fact+sn.findFactorial(r);
		n=n/10;
	    }
		if(temp==fact)
		{
			System.out.println("Strong number");
		}
		else
			System.out.println("not Strong number");
			
}
	public int findFactorial(int r)
	 {
	 	int i=1;
	 	int start =1;
	 	
	 	while(i<=r)
	 	{
	 		start=start*i;
	 		i++;
	 		}
	 	return start;
	 }
	
}
