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
    public int sumNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftsum = sumNodes(root.left);
        int rightsum = sumNodes(root.right);
        return leftsum + rightsum + root.val;
    }
    public int countNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left + right + 1;
    }
    public int averageOfSubtree(TreeNode root) {
        int num = 0;
        if(root==null){
            return 0;
        }
        
        int left = averageOfSubtree(root.left);
        int right = averageOfSubtree(root.right);
        int count = sumNodes(root)/countNodes(root);
        if(count==root.val){
            num++;
        }
        return num+left+right;
    }
}