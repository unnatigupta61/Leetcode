class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<>();
        if(root == null) return sol;
        Stack<TreeNode> bag = new Stack<>();
        bag.push(root);
        while(!bag.isEmpty()){
               TreeNode node = bag.pop();
            sol.add(node.val);
            if(node.right != null) bag.push(node.right);
            
            if(node.left != null) bag.push(node.left);
        }
        return sol; 
    }
}
