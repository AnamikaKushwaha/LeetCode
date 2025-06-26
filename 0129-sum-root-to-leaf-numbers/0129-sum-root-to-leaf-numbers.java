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
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return ans;
    }
    void helper(TreeNode root, int curr){
        if(root == null)
           return;
        curr = curr * 10 + root.val;
        if(root.left == null && root.right == null) {
            ans = ans + curr;
            return;
        }
        helper(root.left, curr);
        helper(root.right, curr);
    }
}