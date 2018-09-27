package arrays;

public class BuyandSellStocks {

	public static int answer(int[] arr) {
		int profit = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i]) {
				profit += arr[i] - arr[i - 1];
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		int[] array = { 7, 1, 5, 3, 6, 4 };
		int answer = answer(array);
		System.out.println(answer);
	}

}
