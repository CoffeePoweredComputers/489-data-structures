public class AVL<E extends Comparable>{

    public class TreeNode<E extends Comparable>{
        E data;
        int height;
        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E data) {
            this.data = data;
            left = null;
            right = null;
            height = 0;
        }

    }

    private TreeNode<E> root;

    public AVL() {
        root = null;
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(TreeNode<E> node){
        if(node != null){
            inorderTraversal(node.left);
            System.out.println(node.data);
            inorderTraversal(node.right);
        }
    }

    private TreeNode<E> findMinNode(TreeNode<E> curr){

        if(curr == null){
            return null;
        }

        while(curr.left != null){
            curr = curr.left;
        }

        return curr;
    }

    /* Step 1: Modify these methods to: 1) Update Height and 2) balance curr upon returning */
    public void insert(E data) {
        root = insert(root, data);
    }

    private TreeNode<E> insert(TreeNode<E> curr, E data){

        if(curr == null){
            curr = new TreeNode<>(data);
            return curr;
        } else if (data.compareTo(curr.data) < 0) {
            curr.left = insert(curr.left, data);
        } else {
            curr.right = insert(curr.right, data);
        }
        return curr;
    }

    public void remove(E data){
        root = remove(root, data);
    }

    private TreeNode<E> remove(TreeNode<E> curr, E data){

        if(curr == null){
            return null;
        }

        if(curr.data.compareTo(data) < 0){
            curr.right = remove(curr.right, data);
        } else if (curr.data.compareTo(data) > 0){
            curr.left = remove(curr.left, data);
        } else {
            if(curr.left == null){
                return curr.right;
            }else if(curr.right == null){
                return curr.left;
            }else{
                TreeNode<E> minNode = findMinNode(curr.right);
                curr.data = minNode.data;
                curr.right = remove(curr.right, minNode.data);
            }
        }
        return curr;

    }

    /*
    Implement the rest of the following methods to finish transforming the
    BST into an AVL tree.
     */
    private TreeNode<E> balance(TreeNode<E> curr){
        return curr; //REMOVE WHEN IMPLEMENTING
    }


    private TreeNode<E> leftRotate(TreeNode<E> node){
        return node; // REMOVE WHEN IMPLEMENTING
    }

    private TreeNode<E> rightRotate(TreeNode<E> node){
        return node; // REMOVE WHEN IMPLEMENTING
    }

    private TreeNode<E> leftRightRotate(TreeNode<E> node){
        return node; // REMOVE WHEN IMPLEMENTING
    }

    private TreeNode<E> rightLeftRotate(TreeNode<E> node){
        return node; // REMOVE WHEN IMPLEMENTING
    }

    /* Step 3) Implement search method that measures steps to find node */

    public int search(E data){
        return search(root, data);
    }

    private int search(TreeNode<E> curr, E data){
        return -1; // REMOVE WHEN IMPLEMENTING
    }

}
