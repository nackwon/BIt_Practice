package com.javaex.problem02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem01 {

	private void solve() {

		int[] arr = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 3 == 0) {
				sum += arr[i];
				count++;
			}
		}

		System.out.println("주어진 배열에서 3의 배수의 개수 =>" + count);
		System.out.println("주어진 배열에서 3의 배수의 합 =>" + sum);

	}

	public static void main(String[] args) {
		sc.init();

		new Problem01().solve();
	}

	static class sc {

		private static BufferedReader br;
		private static StringTokenizer st;

		static void init() {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer("");
		}

		static String readLine() {
			try {
				return br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

		static String readLineReplace() {
			try {
				return br.readLine().replaceAll("\\+s", "");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

		static String next() {

			while (!st.hasMoreTokens()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		static int nextInt() {
			return Integer.parseInt(next());
		}

		static Long nextLong() {
			return Long.parseLong(next());
		}

		static double nextDouble() {
			return Double.parseDouble(next());
		}
	}
}
