import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner (System.in);
		
		int number = sc.nextInt();

		int num1, num2;
		int new_number=number;
		int cycle = 0;
		
		//System.out.format("%02d%n",number);
		//출력시 두자리수로 앞에 0을 붙여 출력하기
		
		if (number<10)
		{
			do
			{
				cycle++;
				
				num1 = number/10; 
				num2 = number%10; 
				
				if (num1+num2<=9)
					number = num2*10 + (num1+num2);
						
				else
					number = num2*10 + ((num1+num2)%10);

				
			} while(number != new_number);
			
			System.out.println(cycle);
		}

		
		if (number>=10)
		{
			do
			{
				cycle++;
				
				num1 = number/10; 
				num2 = number%10; 
				
				if (num1+num2<=9)
					number = num2*10 + (num1+num2);
						
				else
					number = num2*10 + ((num1+num2)%10);
				
			} while(number != new_number);
			
			System.out.println(cycle);
			
		}
	}

}
