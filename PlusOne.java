package arrays;

public class PlusOne {

	public static int[] answer(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < 9) {
				arr[i]++;
				return arr;
			}
			arr[i] = 0;
		}
		int[] a = new int[arr.length + 1];
		a[0] = 1;
		return a;

	}

	public static void main(String[] args) {
		int[] array = { 9, 9, 9, 9 };
		int[] answer = answer(array);

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);

		}

	}
}
