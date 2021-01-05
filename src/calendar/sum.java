package calendar;
import java.util.*;

public class sum {
	public static void main(String[] args) {
		System.out.println("두 정수를 입력하세요.");
		Scanner scan1 = new Scanner(System.in); // from keyboard
		//Scanner scan2 = new Scanner(System.in); // from keyboard
		int x = scan1.nextInt();
		int y = scan1.nextInt();
		
		int result = x + y;
		
		//System.out.println("두 수의 합은 "+result+ " 입니다.");
		System.out.printf("%d와 %d의 합은 %d입니다.",x,y,result);
		scan1.close();
		//scan2.close(); 
	}
}
