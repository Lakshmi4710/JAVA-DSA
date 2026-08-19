class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid[0].length; // stores number of rows
        int m=grid.length;    // stores number of columns
      // creates 2D matrix where dp[i][j] represents minimum path sum to reach cell (i,j)
      int[][] dp=new int[m][n];
        dp[0][0]=grid[0][0];
      // To get 1st row values we need its previous left values from left - right
        for(int i=1;i<n;i++){
            dp[0][i]=grid[0][i]+dp[0][i-1];
        }
        // To get 1st column values we need its previous up values from up - down
            for(int j=1;j<m;j++){
                dp[j][0]=grid[j][0]+dp[j-1][0];
            }
        // Finds the minimum either from the left (i, j-1) or from above (i-1, j).
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
           dp[i][j] =grid[i][j]+Math.min(dp[i][j-1],dp[i-1][j]);
            }}
      // results accumulated minimum value  at the end of dp matrix
            return dp[m-1][n-1];
    }
}
