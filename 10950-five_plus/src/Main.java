import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		
		int round;
		int num1, num2;
		
		round = sc.nextInt();
		
		for (int i=0;i<round;i++)
		{
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.println(num1+num2);
		}
	}

}
