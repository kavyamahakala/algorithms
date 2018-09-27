package arrays;

public class MovingZeros {
	
	public static int[] moveZeros(int[] arr) {
		int[] answer=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
			answer[k]=arr[i];
			k++;
			}
		}
		while(k<arr.length) {
			answer[k]=0;
			k++;
		}
		
		
		return answer;
		
	}

	
	public static void main(String[] args) {
		int[] array= {1,0,3,4,5,0,9};
		int[] result=moveZeros(array);
		for(int i=0;i<array.length;i++)
		System.out.println(result[i]);
	}
}
