package com.javaex.problem01;

import java.util.Random;
import java.util.Scanner;

public class Problem07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int number, random;
		String start;
		System.out.println("==================");
		System.out.println("   [숫자맞추기 게임]");
		System.out.println("==================");

		random = new Random().nextInt(100) + 1;
		// random = (int) (Math.random() * 100) + 1;

		while (true) {
			System.out.print(">> ");
			number = sc.nextInt();

			if (random == number) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				sc.nextLine();// 개행해야한다.
				start = sc.nextLine();
				if (start.equals("y")) {
					System.out.println("==================");
					System.out.println("   [숫자맞추기 종료]");
					System.out.println("==================");
					System.exit(0);
				} else {
					continue;
				}
			} else if (random < number) {
				System.out.println("더 낮게");
			} else {
				System.out.println("더 높게");
			}
		}
	}
}
