 //           1
//         /  \
//        2    3
//       / \  / \
//      4  5 6   7
// Output : [1],[3,2],[4,5,6,7]

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class ZigZag {

    public static List<List<Integer>> traverse(TreeNode root){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i=0; i<levelSize;i++ ){
               TreeNode node = queue.poll();
               if(leftToRight)
                    currentLevel.add(node.val);
                else
                    currentLevel.add(0,node.val);
               if(node.left != null)
                  queue.offer(node.left);
               if(node.right != null)
                  queue.offer(node.right);
            }
            result.add(currentLevel);
            leftToRight = !leftToRight;
        }
        return result;
    }



    public static void main(String[] args){
 //           1
//         /  \
//        2    3
//       / \  / \
//      4  5 6   7
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println(traverse(root));

    }

}

