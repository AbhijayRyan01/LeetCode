class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int prev2 = nums[0];
        if(n==1){
            return prev2;
        }
        int prev1 = Math.max(nums[0], nums[1]);
        int res = prev1;
        for(int i=2; i<n; i++){
            res = Math.max(prev2 + nums[i], prev1);
            prev2 = prev1;
            prev1 = res;
        }
        return res;
    }
}