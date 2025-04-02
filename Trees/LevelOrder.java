package algos.merge_intervals;

import java.util.*;

public class LevelOrder {

    public static List<List<Integer>> traverse(TreeNode root){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i=0; i<levelSize;i++ ){
               TreeNode node = queue.poll();
               currentLevel.add(node.val);
               if(node.left != null)
                  queue.offer(node.left);
               if(node.right != null)
                  queue.offer(node.right);
            }
            result.add(currentLevel);
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

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        val = x;
    }
}