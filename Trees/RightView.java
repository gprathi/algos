import java.util.*;

public class RightView {

    public static List<Integer> printRightView(TreeNode root){
        List<Integer> rightView = new ArrayList<>();
        if(root == null)
            return rightView;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            TreeNode currentNode = null;
            for(int i=0;i<levelSize;i++){
                currentNode = queue.poll();
                if(currentNode.left != null)
                    queue.add(currentNode.left);
                if(currentNode.right != null)
                    queue.add(currentNode.right);
            }
            rightView.add(currentNode.val);
        }

        return rightView;
    }

    public static void main(String[] args){

    //           1
   //         /  \
   //        2    3
   //       / \
   //      4  5
   // Output : 1,3,5
   TreeNode root = new TreeNode(1);
   root.left = new TreeNode(2);
   root.right = new TreeNode(3);
   root.left.left = new TreeNode(4);
   root.left.right = new TreeNode(5);


   System.out.println(printRightView(root));
    }

}
