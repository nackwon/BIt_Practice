package com.javaex.problem02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem02 {

	private void solve() {

		double[] arr = new double[5];
		double sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println("평균은 " + sum / arr.length + "입니다.");

	}

	public static void main(String[] args) {
		sc.init();

		new Problem02().solve();
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
