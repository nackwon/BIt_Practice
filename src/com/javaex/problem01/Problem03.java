package com.javaex.problem01;

public class Problem03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if (i * j >= 10) {
					System.out.print(j + "*" + i + "=" + i * j + " ");
				} else {
					System.out.print(j + "*" + i + "=" + i * j + "  ");
				}
			}
			System.out.println();
		}
	}
}
