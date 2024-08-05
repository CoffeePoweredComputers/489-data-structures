import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree<E extends Comparable<E>> {

    public static class TreeNode<E extends Comparable<E>> {

        E data;
        TreeNode<E> left;
        TreeNode<E> right;

        public TreeNode(E data) {
            this.data = data;
            left = null;
            right = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private TreeNode<E> root;
    private int size;

    public BinarySearchTree() {
        root = null;
        size = 0;
    }

    public void add(E data) {
        root = add(root, data);
    }

    private TreeNode<E> add(TreeNode<E> curr, E data) {
        return new TreeNode<>(null); // remove when implementing this method
    }

    public TreeNode<E> search(E data) {
        return search(root, data);
    }

    public TreeNode<E> search(TreeNode<E> curr, E data) {
        return null;
    }


    public void remove(E data) {
        root = remove(root, data);
    }

    private TreeNode<E> remove(TreeNode<E> curr, E data) {
        return new TreeNode<>(null); // remove when implementing this method
    }

    public TreeNode<E>  findMinNode(){
        return findMinNode(root);
    }

    private TreeNode<E> findMinNode(TreeNode<E> curr) {
        return null; // remove when implementing this method
    }

    /* Inorder Traversal */
    public void traverseInOrder() {
        System.out.print("Inorder Traversal: ");
        traverseInOrder(root);
        System.out.println();
    }

    private void traverseInOrder(TreeNode<E> curr) {
        return; // remove when implementing this method
    }

    /* Preorder Traversal */
    public void traversePreOrder() {
        System.out.print("Preorder Traversal: ");
        traversePreOrder(root);
        System.out.println();
    }

    private void traversePreOrder(TreeNode<E> curr) {
        return; // remove when implementing this method
    }

    /* Post Order Traversal */
    public void traversePostOrder() {
        System.out.print("Postorder Traversal: ");
        traversePostOrder(root);
        System.out.println();
    }

    private void traversePostOrder(TreeNode<E> curr) {
        return; // remove when implementing this method
    }
}
