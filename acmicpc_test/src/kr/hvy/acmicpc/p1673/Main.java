package kr.hvy.acmicpc.p1673;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		List<String> lines = new ArrayList<>();

		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {
				lines.add(scanner.nextLine());
			}
		}

		List<Integer> result = new ArrayList<>();

		for (String line : lines) {
			String[] cl = line.split(" ");

			int chicken = Integer.parseInt(cl[0]);
			int coupon = Integer.parseInt(cl[1]);

			result.add(calc(chicken, coupon));
		}

		for (int n : result) {
			System.out.println(String.valueOf(n));
		}

	}

	private static int calc(int chicken, int coupon) {

		int result = chicken;
		while (chicken / coupon != 0) {
			result += chicken / coupon;
			chicken = chicken / coupon + chicken % coupon;
		}
		return result;

	}

}
