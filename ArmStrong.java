
public class ArmStrong {

	public static void main(String[] args) {
		int num = 153;
		int x = num;
		int count = 0;
		while (x != 0) {
			int rem = x % 10;
			count++;
			x = x / 10;

		}
		int y = num;
		
		int store=0;
		while (y != 0) {
			int temp = 1;
			int rem = y % 10;
			for(int i=1; i<=count; i++)
			{
			temp = rem * temp;
		
			}
			y = y / 10;
		 store=store+temp;
 
		}
		
		if (store == num) {
			System.out.println(num + " is ArmStrong Number");
		} else {
			System.out.println(num + "is Not Armstrong Number");
		}

	}

}
