package jeon_calender;

import java.util.Scanner;
import java.util.Arrays;

public class DayofWeek {

	public static void main(String[] args) {
		String[] day = { "SU", "MO", "TU", "WE", "TH", "FR", "SA" };
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("월을 입력");
		Scanner scanner2 = new Scanner(System.in);
		int monthInput = scanner2.nextInt();

		System.out.println("1일이 시작하는 요일을 입력");
		Scanner scanner = new Scanner(System.in);
		String dayInput = scanner.nextLine();

		int blank = Arrays.asList(day).indexOf(dayInput);
		int count = 0;

		System.out.println(" SU MO TU WE TU FR SA");
		System.out.println("-----------------------");
		if (monthInput >= 1 && monthInput <= 12) {
			int n = month[monthInput - 1];
			int[] days = new int[n];

			for (int i = 0; i < n; i++) {
				if (i % 7 == 0 && i != 0) {
					System.out.print("\n");
				}
				if (count == 0) {
					for (int j = 0; j < blank; j++) {
						System.out.printf("%3s", "");
						count = 1;
						i = blank;
					}
				}

				days[i - blank] = i + 1 - blank;
				System.out.printf("%3d", days[i - blank]);

			} // 입력한 달의 총 일수가 들어 있는 배열 days 생성 해냈다시발아
		}
	}
}

