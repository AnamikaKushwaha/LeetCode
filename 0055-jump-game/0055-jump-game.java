class Solution {
    public boolean canJump(int[] nums) {
        int reached = nums.length-1;
        for(int i = nums.length-1; i>=0; i-- ){
            if(nums[i] + i >= reached){
                reached = i;
            }
        }
        if(reached == 0) return true;
        return false;
    }
}