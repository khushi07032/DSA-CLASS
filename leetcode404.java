public class leetcode404 {
    public int sumOfLeftLeaves(TreeNode root) {
if (root == null) {
return 0;
}

    int sum = 0;

    // Check whether the left child is a leaf
    if (root.left != null &&
        root.left.left == null &&
        root.left.right == null) {

        sum += root.left.val;
    }

    // Recursively calculate the sum
    sum += sumOfLeftLeaves(root.left);
    sum += sumOfLeftLeaves(root.right);

    return sum;
}
}
