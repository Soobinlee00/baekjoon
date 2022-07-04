import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int number = sc.nextInt();
		
		int each_num;
		
		for (int i =0;i<size;i++)
		{
			each_num = sc.nextInt();
		
			if (each_num<number)
				System.out.print(each_num + " ");
		}
	}

}
