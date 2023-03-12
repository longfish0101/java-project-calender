package jeon_calender;
import java.util.Scanner;

public class Month {
	static int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};

	public static int maxDay(int a) {
		return month[a-1];
	}
	
	public static int repeat() {
		System.out.println("반복할 횟수 입력");
		Scanner scanner = new Scanner(System.in);
		int repeat = scanner.nextInt();
		return repeat;
	}
	
	public static void print(int repeat) {
		for(int i=0; i<repeat; i++) {
			int count=0;
			while(count == 0) {
			System.out.println("월을 입력(1~12\n>");
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			if (input == -1) {
				System.out.print("good bye");
				break;
			}
			if (input >= 1 && input <= 12) {
				System.out.printf("%d월은 총 %d일로 구성되어 있습니다\n", input, maxDay(input));
				count++;
			} else {
			System.out.println("1~12만 입력");
			}	
			}
		}
	}
	
	public static void main(String[] args) {
		print(repeat());
	}
}
