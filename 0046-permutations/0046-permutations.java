class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), ans);
        return ans;
    }

    public void backtrack(int[] nums, List<Integer> path, List<List<Integer>> ans) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int num : nums) {
            if(!path.contains(num)){
                path.add(num);
                backtrack(nums, path, ans);
                path.remove(path.size() - 1);
            }
        }
    }
}