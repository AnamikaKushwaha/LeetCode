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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        preOrder(list1, root1);
        preOrder(list2, root2);
        if(list1.equals(list2)) 
            return true;
        else 
            return false;
        
    }
    void preOrder(List<Integer> list, TreeNode root){ 
        if(root == null) 
            return;
        if(root.left == null && root.right == null){
            list.add(root.val);
            return;
        }
        preOrder(list, root.left);
        preOrder(list, root.right);
    }
    
}