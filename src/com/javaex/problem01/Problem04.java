package com.javaex.problem01;

public class Problem04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			for (int j = i; j < 10 + i; j++) {
				if (j < 10) {
					System.out.print(j + "  ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
}
