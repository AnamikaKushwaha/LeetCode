/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean ans = false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root, targetSum, 0);
        return ans;
    }
    void helper(TreeNode root, int targetSum, int curr){
        if(root == null)
            return;
        curr = curr + root.val;

        if(root.left == null && root.right == null && curr == targetSum) {
            ans = true;
            return;
        }
        helper(root.left, targetSum, curr);
        helper(root.right, targetSum, curr);
    }
}