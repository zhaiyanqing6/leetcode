package medium;

public class UniquePaths {
	public static int uniquePaths(int m, int n) {
		int[][] res = new int[m][n];
		for (int k = 0; k < m; k++)
			res[k][0] = 1;
		for (int l = 0; l < n; l++)
			res[0][l] = 1;
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				res[i][j] = res[i - 1][j] + res[i][j - 1];
			}
		}
		return res[m-1][n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(2, 2));
	}

}
