// class TreeNode{
//     TreeNode left;
//     TreeNode right;
//     int val;

//     TreeNode(int x){
//         val = x;
//     }
// }

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumDepth {

  public static int findMinDepth(TreeNode root){

    if(root == null)
        return 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    int minTreeDepth = 0;
    while(!queue.isEmpty()){
        minTreeDepth++;
        int levelSize = queue.size();
         List<Integer> currentLevel = new ArrayList<>(levelSize);
            for(int i=0; i<levelSize;i++ ){
               TreeNode node = queue.poll();
                currentLevel.add(node.val);
               if(node.left == null && node.right == null)
                  return minTreeDepth;
               if(node.left != null)
                  queue.offer(node.left);
               if(node.right != null)
                  queue.offer(node.right);

            }
    }
    return minTreeDepth;
}
// 1 [2,3]
// 1  2
  public static void main(String[] args){
    //           1
   //         /  \
   //        2    3
   //       / \
   //      4  5
   // Output : 2
           TreeNode root = new TreeNode(1);
           root.left = new TreeNode(2);
           root.right = new TreeNode(3);
           root.left.left = new TreeNode(4);
           root.left.right = new TreeNode(5);


           System.out.println(findMinDepth(root));

       }
}
