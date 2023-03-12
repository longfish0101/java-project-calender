package jeon_calender;

import java.util.Scanner;

public class Calculator {
	public static void printCal() {
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		while (true) {
			System.out.println("월을 입력하세요.\n>");
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			if (input >= 1 && input <= 12) {
				int n = month[input - 1];
				int[] days = new int[n];
				for (int i = 0; i < n; i++) {
					days[i] = i + 1;
				}
				System.out.println("  일 월  화  수 목  금 토");
				for (int i = 0; i < days.length; i++) {
					if ((i + 1) % 7 == 0) {
						System.out.printf("%3d\n", days[i]);
					} else {
						System.out.printf("%3d", days[i]);
					}
				}
				System.out.println();
			} else if (input == -1) {
				System.out.println("bye");
				break;
			} else {
				System.out.println("1~12만 입력");
				continue;
			}
		}
	}

	public static void main(String[] args) {
		printCal();
	}
}
