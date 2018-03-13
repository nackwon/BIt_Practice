package com.javaex.problem01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem06 {

	private void solve() {

		int n = sc.nextInt();

		System.out.println(sum(n));
	}

	public static int sum(int n) {

		int sum = 0;
		for (int i = n % 2; i <= n; i += 2) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		sc.init();

		new Problem06().solve();
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