package arrays;

public class MaximumSubArray {

	public static int optimizedAnswer(int[] arr) {
		int max= arr[0];
		int total=arr[0];
		for(int i=1;i<arr.length;i++) {
			max=Math.max(max+arr[i],arr[i]);
			total= Math.max(total, max);
		}
		return total;
	}
	   public static void main(String[] args) {


	        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
	        int answer = optimizedAnswer(array);
	        System.out.println(answer);

	    }
}
