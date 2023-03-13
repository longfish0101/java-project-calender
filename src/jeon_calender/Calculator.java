package jeon_calender;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
	public static void printCal() {
		int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] day = {"SU","MO","TU","WE","TU","FR","SA"};
		String blan = " ";
		while (true) {
			System.out.println("월을 입력하세요.\n>");
			Scanner scanner = new Scanner(System.in);
			System.out.println("1일 시작되는 요일을 입력하세요.\n>");
			Scanner scanner2 = new Scanner(System.in);
			
			String dayInput = scanner2.nextLine();
			int blank = Arrays.asList(day).indexOf(dayInput);
			int input = scanner.nextInt();
			
			
			if (input >= 1 && input <= 12) {
				int n = month[input - 1];
				int[] days = new int[n];
				for (int i = 0; i < n; i++) {
					days[i] = i + 1;
				}
				System.out.println(" SU MO TU WE TU FR SA");
				System.out.println("-----------------------");
				
				for (int i=0; i<blank; i++) {
					System.out.printf("%3s", blan);
					}
				}
			

//				for (int i = 0; i < days.length; i++) {
//					if ((i + 1) % 7 == 0) {
//						System.out.printf("%3d\n", days[i]);
//					} else {
//						System.out.printf("%3d", days[i]);
//					}
//				}
//				System.out.println();
//			} else if (input == -1) {
//				System.out.println("bye");
//				break;
//			} else {
//				System.out.println("1~12만 입력");
//				continue;
//			}
//		}
//	}

	public static void main(String[] args) {
		printCal();
	}
}


