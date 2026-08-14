class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
      // Base cases
        if(n==0) return 0;
        if(n==1) return cost[0];
      // dp array stores values i.e minimum cost to reach step i
        int[] dp=new int[n+1];
        for(int i=2;i<=n;i++){
      //choosing cheaper path from previous step or step before that
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
       // Reaching step n means reaching  top
        return dp[n];
    }}
