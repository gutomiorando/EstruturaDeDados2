/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author gustavo.miorando
 */
public class TestSearch {

    public static void preorder(Node n) {

        // 1 - visita o Node
        System.out.println(n.element);
        // 2 - Visitar o Node a esquerda com recursao
        if (n.left != null) {
            preorder(n.left);
        }
        // Visitar o Node a direita
        if (n.right != null) {
            preorder(n.right);
        }
    }

    public static void inorder(Node n) {

        // 1 - Visitar o Node a esquerda com recursao
        if (n.left != null) {
            inorder(n.left);
        }
        // 2 - Visita o Node
        System.out.println(n.element);
        // 3 - Visitar o Node a direita
        if (n.right != null) {
            inorder(n.right);
        }

    }
    
    public static void postorder(Node n) {

        // 1 - Visitar o Node a esquerda com recursao
        if (n.left != null) {
            postorder(n.left);
        }
        // 2 - Visitar o Node a direita
        if (n.right != null) {
            postorder(n.right);
        }
        // 3 - Visita o Node
        System.out.println(n.element);
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree("A");

        Node a = tree.getRoot();
        Node b = tree.addLeftChild(a, "B");
        Node c = tree.addrightChild(a, "C");
        Node d = tree.addrightChild(b, "D");

        //preorder(a);
        //inorder(a);
        postorder(a);
    }

}
