package arrays;

import java.util.Arrays;

public class Partition {
	public static int answer(int[] arr) {
		int sum = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i = i + 2) {
			sum += arr[i];
		}

		return sum;
	}

	public static void main(String[] args) {

		int[] array = { 1, 4, 3, 2 };
		int answer = answer(array);
		System.out.println(answer);
	}

}
