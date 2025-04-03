class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int x){
        val = x;
    }
}

public class LowestCommonAncestor {

    public static int findLCA(TreeNode root, int p, int q){

        while (root != null) {
            if(p < root.val  && q < root.val){
                root = root.left;
            }
            else if(p > root.val && q > root.val){
                root = root.right;
            }
            else{
                return root.val;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println("Test");

                // Creating the example tree
                TreeNode root = new TreeNode(6);
                root.left = new TreeNode(2);
                root.right = new TreeNode(8);
                root.left.left = new TreeNode(0);
                root.left.right = new TreeNode(4);
                root.right.left = new TreeNode(7);
                root.right.right = new TreeNode(9);
                root.left.right.left = new TreeNode(3);
                root.left.right.right = new TreeNode(5);

                System.out.println(findLCA(root, 2, 8)); //expected 6
    }

}
