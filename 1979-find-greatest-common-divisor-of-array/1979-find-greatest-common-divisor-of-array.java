class Solution {
    public int findGCD(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        mini = nums[0];
        maxi = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i] < mini){
                mini = nums[i];
            }
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }
        return gcd(mini,maxi);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}