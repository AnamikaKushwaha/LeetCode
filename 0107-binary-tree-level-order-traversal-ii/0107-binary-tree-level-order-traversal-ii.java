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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int levelSize = q.size();

            for(int i = 0; i<levelSize; i++){
                TreeNode element = q.remove();
                temp.add(element.val);

                if(element.left != null){
                    q.add(element.left);
                }
                if(element.right != null) {
                    q.add(element.right);
                }
            }
            ans.add(temp);   
        }
        Collections.reverse(ans);
        return ans;
    }
}