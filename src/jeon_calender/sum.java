package jeon_calender;
import java.util.Scanner;
public class sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력. ex) 5 10");
		Scanner input = new Scanner(System.in);
		String num1 = input.nextLine();
		String[] splitedNum = num1.split(" ");
		int num2 = Integer.parseInt(splitedNum[0]);
		int num3 = Integer.parseInt(splitedNum[1]);
		
		int result = num2+num3;
		System.out.println(result);
	}
}
