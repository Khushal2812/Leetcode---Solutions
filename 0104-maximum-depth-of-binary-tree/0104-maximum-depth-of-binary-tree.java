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
    public int height(TreeNode root){
        if(root==null)
        return 0;
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int max = Math.max(leftheight,rightheight)+1;
        return max;
    }
    public int maxDepth(TreeNode root) {
        return height(root);
    }
}