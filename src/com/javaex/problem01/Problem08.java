package com.javaex.problem01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int select_n = 0;
		int money = 0;
 
		while (true) {
			System.out.println("========================");
			System.out.println("1.예금 2.출금 3.잔고 | 4.종료");
			System.out.println("========================");
			System.out.print("선택> ");

			select_n = sc.nextInt();

			switch (select_n) {
			case 1:
				System.out.print("예금액>");
				money += sc.nextInt();

				break;
			case 2:
				System.out.print("출금액>");
				money -= sc.nextInt();
				break;
			case 3:
				System.out.print("잔고액>");
				System.out.println(money);
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("다시 입력해주세요");
				continue;
			}
			sc.close();
		}
	}
}
