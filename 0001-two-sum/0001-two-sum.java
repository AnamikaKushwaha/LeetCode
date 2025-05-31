class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;
            if (hm.containsKey(complement)) {
                return new int[] { hm.get(complement), i };
            }
            hm.put(num, i);
        }
        return new int[] { -1, -1 };
    }
}