class Solution {
    public int climbStairs(int n) {
      // Base case
        int prev1=1;      // represents ways(i-2)
        int prev2=1;      // represents ways(i-1)
        for(int i=2;i<=n;i++){
            int curr=prev1+prev2;    // total ways=ways(i-1)+ways(i-2)
          // shifts values for next iteration
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
}
