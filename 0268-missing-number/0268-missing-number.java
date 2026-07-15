class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int summ = n * (n + 1) / 2;
        int xorr = 0;
        for(int i=0; i<n; i++){
            xorr += nums[i];
        }
        return summ - xorr;
    }
}