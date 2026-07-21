class Solution {
    public int maxRob(int[] nums, int start, int end){
        int prev2 = nums[start];
        int prev1 = Math.max(nums[start], nums[start+1]);
        int res = prev1;
        for(int i=start+2; i<end; i++){
            res = Math.max(prev2 + nums[i], prev1);
            prev2 = prev1;
            prev1 = res;
        }
        return res;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);
        int first = maxRob(nums, 0, n-1);
        int last = maxRob(nums, 1, n);
        return Math.max(first, last);
    }
}