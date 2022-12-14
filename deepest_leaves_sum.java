class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int levels = 0;
        while(q.size()>0)
        {
            levels = 0;
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();
                levels+=node.val;
                if(node.left!=null)
                {
                    q.offer(node.left);
                }
                if(node.right!=null)
                {
                    q.offer(node.right);
                }
            }
        }
        return levels;
    }
}
