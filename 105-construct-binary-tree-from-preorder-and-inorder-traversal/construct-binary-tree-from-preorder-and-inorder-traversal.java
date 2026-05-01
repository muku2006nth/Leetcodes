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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int[] idx = new int[]{0};    // point to the preorder traversal array  and we have to passed it as the reference so that's why i taken it in the array form.

        HashMap<Integer, Integer> mp = new HashMap<>();
        for( int i = 0; i < n; i++ ) {
            mp.put( inorder[i], i);
        }

        return solve(preorder, inorder, 0, n - 1, idx, mp); //preorder, inorder, start, end, and the idx pointing to the preorder traversal array.
    }

    private TreeNode solve(int[] preorder, int[] inorder, int start, int end, int[] idx, HashMap<Integer, Integer> mp) {
        if( start > end ) return null;

        int rootVal = preorder[idx[0]];
        
        int i = mp.get(rootVal);

        idx[0] += 1;
        TreeNode root = new TreeNode(rootVal);
        root.left  = solve(preorder, inorder, start, i - 1, idx, mp);
        root.right = solve(preorder, inorder, i + 1, end, idx, mp);

        return root;
    }
}