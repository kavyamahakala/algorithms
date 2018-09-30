package arrays;

public class RotateMatrixClockwise {
	public static int[][] rotateMatrix(int N, int[][] matrix) {
		for (int i = 0; i < N / 2; i++) {
			for (int j = i; j < N - 1 - i; j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[N - 1 - i][j];
				matrix[N - 1 - i][j] = matrix[N - 1 - j][N - 1 - i];
				matrix[N - 1 - j][N - 1 - i] = matrix[i][N - 1 - j];
				matrix[i][N - 1 - j] = temp;

			}
		}

		return matrix;
	}

	static void displayMatrix(int N, int mat[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(" " + mat[i][j]);

			System.out.print("\n");
		}
		System.out.print("\n");
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		int N = 4;

		// Test Case 1
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// Tese Case 2
//        int mat[][] = { 
//                            {1, 2, 3}, 
//                            {4, 5, 6}, 
//                            {7, 8, 9} 
//                        }; 
//       

		// Tese Case 3
		/*
		 * int mat[][] = { {1, 2}, {4, 5} };
		 */

		// displayMatrix(mat);

		rotateMatrix(N, mat);

		// Print rotated matrix
		displayMatrix(N, mat);
	}
}
