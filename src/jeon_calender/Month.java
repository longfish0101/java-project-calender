package jeon_calender;
import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};

		for (int i = 0; i < 1;) {
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			if (num >= 1 && num <= 12) {
				System.out.printf("%d월은 총 %d일로 구성되어 있습니다", num, month[num - 1]);
				i++;
				scanner.close();
			} else {
				System.out.println("1~12사이를 입력해 주세요");
			}
		}
	}
}
