package arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static int answer(int[] arr) {
		int number = 0;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			}
			else {
			hm.put(arr[i], 1);
			}
		}
		int check = arr.length / 2;
		int count = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> iterator : hm.entrySet()) {
			if (iterator.getValue() >= check) {
				if (iterator.getValue() > count) {
					count = iterator.getValue();
					number = iterator.getKey();
				}
			}

		}

		return number;
	}

	public static void main(String[] args) {
		int[] array = { 7, 0, 1, 3, 1, 4,8 };
		int answer = answer(array);
		System.out.println(answer);
	}
}
