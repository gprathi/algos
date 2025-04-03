

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int x){
        val = x;
    }
}

public class TreePathSum {

    public static boolean hasPath(TreeNode root, int sum){
        if(root == null)
            return false;
        // if we hit a leaf node and sum equal to the value
        if(root.val == sum && root.right == null && root.left == null)
            return true;
        // recursively check right and left tree with residual value
        return hasPath(root.left, sum - root.val) || hasPath(root.right, sum - root.val);
    }

    public static void main(String[] args){
       // Input: root = [1, 2, 3, 4, 5, 6, 7], S = 10
       //           1
       //        2      3
       //     4    5  6    7
       // sum = 10 , 1,3,6

       TreeNode root = new TreeNode(1);
       root.left = new TreeNode(2);
       root.left.left = new TreeNode(4);
       root.left.right = new TreeNode(5);
       root.right = new TreeNode(3);
       root.right.right = new TreeNode(7);
       root.right.left = new TreeNode(6);
       ;

       System.out.println(hasPath(root, 10));


    }
}
