import java.util.LinkedList;

public class Test7_25 {
    public int maxLength (int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if(list.contains(arr[i])){
                int j = list.indexOf(arr[i]);
                while(j-- >= 0){
                    list.removeFirst();
                }
            }
            list.add(arr[i]);
            res = Math.max(res,list.size());
        }
        return res;
    }

//    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
//        if(root == null){
//            return -1;
//        }
//        if(o1 == root.val || o2 == root.val){
//            return root.val;
//        }
//        int left = lowestCommonAncestor(root.left,o1,o2);
//        int right = lowestCommonAncestor(root.right,o1,o2);
//        if(left == -1)
//            return right;
//        if(right == -1)
//            return left;
//        return root.val;
//    }

//    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
//        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
//        if(root == null){
//            return lists;
//        }
//        LinkedList<TreeNode> queue = new LinkedList<>();
//        ArrayList<Integer> list = new ArrayList<>();
//        queue.add(root);
//        TreeNode cur = root;
//        TreeNode last = root;
//        TreeNode nLast = null;
//        while(!queue.isEmpty()){
//            cur = queue.poll();
//            if(cur.left != null){
//                queue.add(cur.left);
//                nLast = cur.left;
//            }
//            if(cur.right != null){
//                queue.add(cur.right);
//                nLast = cur.right;
//            }
//            list.add(cur.val);
//            if(cur == last){
//                lists.add(list);
//                list = new ArrayList<>();
//                last = nLast;
//            }
//        }
//        return lists;
//    }
}