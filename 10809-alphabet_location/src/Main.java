import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int [] number = new int [26];
		//알파벳은 26개로 이루어져 있다. 
		
		for (int i=0;i<number.length;i++)
		{
			number[i] = -1;
			//System.out.println(number[i]);
		}
		
		String alphbet = sc.nextLine();
		
		for (int i=0;i<alphbet.length();i++)
		{
			char alp = alphbet.charAt(i);
			//System.out.println(alp-'a');
			
			if (number[alp-'a']== -1)
			{
				number[alp-'a']=i;
			}
		}
		
		for (int i=0;i<number.length;i++)
		{
			System.out.print(number[i] + " ");
		}
		
		//Map
		//서로 다른 두 자료형의 자료가 한 쌍으로 묶여서 표현되는 자료
		//HashMap은 Map 안에서 key/value에 따른 순서 없음
		//TreeMap은 key 값에 따라 오름차순 정렬 -> 정렬 떄문에 대량의 데이터 삽입/삭제시 오래걸림
		//LinkedHashMap은 삽입 순서에 따라 정렬됨
		
	}

}
