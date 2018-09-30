//Say you have an array for which the ith element is the price of a given stock on day i.
//
// If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.
//
//Note that you cannot sell a stock before you buy one.


package arrays;

public class BuyandSellStock0neTransaction {
	public static int answer2(int[] array) {
		int maxprofit=0;
		int minPrice= Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			minPrice= Math.min(minPrice, array[i]);
			maxprofit= Math.max(maxprofit, array[i]-minPrice);
		}
		return maxprofit;
	}
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        int answer = answer2(array);
        System.out.println(answer);
    }
}
