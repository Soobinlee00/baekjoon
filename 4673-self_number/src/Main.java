import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number;
		int num1, num2,num3,num4,num5,num6,num7,num8;
		
		int new_number;
		
		List<Integer> list = new ArrayList<>();
		
		
		for (int i=1;i<10000;i++)
		{
			number = i;
			
			num1 = number/10000;
			num2 = number%10000;
			num3 = num2/1000;
			num4 = num2%1000;
			num5 = num4/100;
			num6 = num4%100;
			num7 = num6/10;
			num8 = num6%10;
			
			new_number = number + num1 +num3 + num5 + num7 + num8;
			
			list.add(new_number);
			//Collections.sort(list);
			//굳이 정렬해주지 않아도됨
			//정렬하지 않으면 시간 4배로 줄어
		}
		
		for (int i=1;i<10000;i++)
		{
			if (list.contains(i) == false)
				System.out.println(i);
		}
	}
}
