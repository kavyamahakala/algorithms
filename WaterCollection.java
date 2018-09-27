package arrays;

public class WaterCollection {
	public int watercollected(int[] heights) {
		int n = heights.length;
		int[] maxheight_left = new int[n];
		int[] maxheight_right = new int[n];
		int water = 0;
		maxheight_left[0] = heights[0];
		for (int i = 1; i < n; i++) {
			maxheight_left[i] = Math.max(maxheight_left[i - 1], heights[i]);
		}

		maxheight_right[n - 1] = heights[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			maxheight_right[i] = Math.max(maxheight_right[i + 1], heights[i]);
		}

		for (int i = 0; i < n; i++) {
			water += Math.min(maxheight_left[i], maxheight_right[i]) - heights[i];
		}

		return water;
	}

	public static void main(String[] args) {
		WaterCollection w = new WaterCollection();
		int[] height = { 0,1,0,2,1,0,1,3,2,1,2,1 };
		int answer = w.watercollected(height);
		System.out.println(answer);
	}
}