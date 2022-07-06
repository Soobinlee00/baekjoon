import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int num = sc.nextInt();
		int sum =0;
		
		String all_number = sc.next();
		sc.close();
		
		for (int i=0;i<num;i++)
		{
			sum += all_number.charAt(i)-'0';
		}
		//아스키코드 '0' (=48)을 빼주면 char을 숫자 값으로 구할 수 있다.
		
		System.out.println(sum);
	}

}
