class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[l] == 0){
                if(nums[r + 1] != 0){
                    int temp = nums[r + 1];
                    nums[r + 1] = nums[l];
                    nums[l] = temp;
                    l++;
                    r++;
                }else{
                    r++;
                }
            }else{
                l++;
                r++;
            }
        }
    }
}