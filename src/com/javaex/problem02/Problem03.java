package com.javaex.problem02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem03 {

	private void solve() {

		char[] ch = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.println();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				ch[i] = ',';
			}
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		sc.init();

		new Problem03().solve();
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
