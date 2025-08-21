package fibonacii_without_Recursion;

public class Fibonacci {
	int num = 12345;

	public void finocii() {
		int num2 = num;
		int temp = 0;
		while (num2 != 0) {

			int rem = num2 % 10;
			temp = temp + rem;
			num2 = num2 / 10;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Fibonacci fi = new Fibonacci();
		fi.finocii();
	}

}
