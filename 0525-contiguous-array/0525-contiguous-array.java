class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0, sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
            sum = sum + nums[i];
            if(sum == 0){
                ans = i+1;
            }else if(map.containsKey(sum)){
                ans = Math.max(ans, i-map.get(sum));
            }
            else{
                map.put(sum, i);
            }
        }
        return ans;
        
    }
}