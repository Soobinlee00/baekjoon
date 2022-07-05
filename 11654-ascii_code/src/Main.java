import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char letter = sc.nextLine().charAt(0);
		//charAt은 String으로 저장된 문자열 중에서 한 글자만 char 타입으로 변환해줌
		
		int code = (int)letter;
		
		System.out.println(code);
	}
}
