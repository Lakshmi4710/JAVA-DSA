class Solution {
// Method to find whether we can reach till end or not
    public boolean canJump(int[] nums) {
        int n=nums.length;
// Tracks max index you can reach 
        int maxr= 0;
        for(int i=0;i<n;i++){
// It means if index > max reach then we cant reach end of array
            if(i>maxr){
                return false;
            }
// Else find max value from(max reach, i+max reach) means update maxr 
            else{
                maxr=Math.max(maxr,i+nums[i]);
            }
        }
        return true;
    }
}
