package practice;

public class FibonacciOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciOther fn = new FibonacciOther();
		fn.findFibonacci1();
			}

			public void findFibonacci1() {
				// TODO Auto-generated method stub
				int first = -1;
				int second = 1;
				int count = 0;
				while(count<=10)
				{
					second = first+second;
					first = second-first;
					count++;
					System.out.println(second+first);
				}
	}

}
