package kr.hvy.acmicpc.p1920;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
		List<String> lines = new ArrayList<>();

		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextLine()) {
				lines.add(scanner.nextLine());
			}
		}

		String[] target = lines.get(1).split(" ");
		List<Integer> list = Arrays.asList(target).stream().parallel().map(o -> {
			return Integer.parseInt(o);
		}).sorted().collect(Collectors.toList());

		String[] searchKeyword = lines.get(3).split(" ");

		for (String key : searchKeyword) {
			int intKey = Integer.parseInt(key);
			System.out.println(binTree(list, intKey, 0, list.size() - 1));
		}

	}

	private static int binTree(List<Integer> list, int value, int low, int high) {

		if (low > high)
			return 0;

		int mid = (low + high) / 2;

		if (list.get(mid) > value)
			return binTree(list, value, low, mid - 1);
		else if (list.get(mid) < value)
			return binTree(list, value, mid + 1, high);
		else
			return 1;

	}

	private static int containsTimeout() {

//		String[] searchKeyword = lines.get(3).split(" ");
//		String line = " " + lines.get(1) + " ";
//		for(String key : searchKeyword) {
//			
//			int result = line.indexOf(" " + key + " ");
//			if(result > -1) {
//				System.out.println("1");
//			}else {
//				System.out.println("0");
//			}
//		}
		return 0;
	}

}
