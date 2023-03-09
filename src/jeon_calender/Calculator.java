package jeon_calender;

import java.util.Arrays;

public class Calculator {
	
	public static void main(String[] args) {
		print(calculator(28));
	}
	
	public static int[] calculator(int n) {
		int[] month = new int[n];
		for(int i=0; i<n; i++) {
			month[i] = i+1;
		}
		return month;
	}
	
	public static void print(int[] m) {
		int len = m.length;
		String[] day = {"일","월","화","수","목","금","토"};
		for(int i=0; i<day.length; i++) {
			System.out.printf("%3s",day[i]);
			if(i == day.length-1) {
				System.out.printf("%n");
			}
		}
		for(int i=0; i<len; i++) {
			if((i+1)%7 == 0) {
				System.out.printf("%3d", m[i]);
				System.out.printf("%n");
			}
			else {
				System.out.printf("%3d",m[i]);
			}
		}
	}
}
