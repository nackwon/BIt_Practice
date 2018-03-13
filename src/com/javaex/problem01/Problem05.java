package com.javaex.problem01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int n = 5;
		int n1;
		int max = 0;

		while (n-- > 0) {
			System.out.print("숫자 : ");
			n1 = sc.nextInt();
			if (max < n1) {
				max = n1;
			}
		}
		System.out.println(max);
	}
}
