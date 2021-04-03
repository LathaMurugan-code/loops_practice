package practice;

public class FibonacciSeries1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FibonacciSeries1 fn = new FibonacciSeries1();
fn.findFibonacci();
	}

	public void findFibonacci() {
		// TODO Auto-generated method stub
		int first = -1;
		int second = 1;
		int third = first+second;
		while(third<10)
		{
			first = second;
			second = third;
			third = first+second;
			System.out.println(third);
		}
	}

}
