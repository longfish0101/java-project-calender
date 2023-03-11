package jeon_calender;
import java.util.Scanner;

public class Month {
	static int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};

	public static int maxDay(int a) {
		return month[a-1];
	}
	public static void main(String[] args) {
		
		Scanner scanner1 = new Scanner(System.in);
		int loop = scanner1.nextInt();
		int[] loopForMonth = new int[loop];
		int count = 0;
		while(count < loop) {
			Scanner scanner2 = new Scanner(System.in);
			int loop2 = scanner1.nextInt();
			loopForMonth[count] = loop2;
			count++;
		}
		
		for (int i=0; i<loopForMonth.length; i++) {
			System.out.printf("%d월은 총 %d일로 구성되어 있습니다\n", loopForMonth[i], maxDay(loopForMonth[i]));

		}
//		for (int i = 0; i < 1;) {
//			Scanner scanner = new Scanner(System.in);
//			int num = scanner.nextInt();
//			if (num >= 1 && num <= 12) {
//				System.out.printf("%d월은 총 %d일로 구성되어 있습니다", num, maxDay(num));
//				i++;
//				scanner.close();
//			} else {
//				System.out.println("1~12사이를 입력해 주세요");
//			}
//		}
	}
}
