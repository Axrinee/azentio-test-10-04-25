class Solution {
    public void flatten(TreeNode root) {
        if(null == root) return;

        flatten(root.left);
        flatten(root.right);

        TreeNode right = root.right;
        TreeNode left = root.left;

        if(null == left) return;
        while(left.right != null) left = left.right;
        root.right = root.left;
        left.right = right;
        root.left = null;
    }
}
