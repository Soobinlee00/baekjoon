import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		
		int sum_num = sc.nextInt();;
	
		int sum = 0;
		
		for (int i=1;i<=sum_num;i++)
		{
			sum += i;
		}
		
		System.out.println(sum);
	}

}
