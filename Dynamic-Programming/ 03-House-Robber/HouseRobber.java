class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
      // Start Recursion
        return maxrob(nums,n);
        
    }
    public int maxrob(int[] nums,int n){
      // Base Cases
        if(n==0 ) return 0;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
      
    // Rob houses from index 0 to n-2
    // Rob houses from index 1 to n-1

    return Math.max(robLin(nums,0,n-2),robLin(nums,1,n-1));
    }
    // Standard House Robber (linear DP) algorithm using O(1) space.
    public int robLin(int[] nums,int st,int en){
        int p1=0; 
        int p2=0;
        for(int i=st;i<=en;i++){
            int t=p1;
        // Option 1: Don't rob current house -> keep previous max (p1)
        // Option 2: Rob current house -> add nums[i] to max from 2 houses back (p2)
            p1=Math.max(p1,p2+nums[i]);
            p2=t;
        }
      // Return max money accumulated by the end of range
        return p1;
    }
}
