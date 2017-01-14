package medium;

public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		if(m<1)
			return 0;
		int n = obstacleGrid[0].length;
		int[][] res = new int[m][n];
		int k=0,l=0;
		for (; k < m; k++){
			if(obstacleGrid[k][0]==1){
				break;
			}
			res[k][0] = 1;
		}
		for (; l < n; l++){
			if(obstacleGrid[0][l]==1){
				break;
			}
			res[0][l] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 1)
					res[i][j] = 0;
				else
					res[i][j] = res[i - 1][j] + res[i][j - 1];
			}
		}
		return res[m - 1][n - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
