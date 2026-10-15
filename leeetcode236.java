public class leeetcode236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
// Base case
if (root == null || root == p || root == q) {
return root;
}

    // Search in the left and right subtrees
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    // If both sides return a node, root is the LCA
    if (left != null && right != null) {
        return root;
    }

    // Otherwise, return the non-null result
    return left != null ? left : right;
}
}
