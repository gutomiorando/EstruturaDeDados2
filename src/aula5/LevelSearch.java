/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.ArrayList;

/**
 *
 * @author gustavo.miorando
 */
public class LevelSearch {

    // trocando a recursão por pilha.
    public static void preorder(Node n) {
        ArrayList<Node> stack = new ArrayList<Node>();
        stack.add(n);
        while (stack.size() != 0) {
            n = stack.remove(stack.size() - 1);
            System.out.print(n.element + " ");
            if (n.right != null) {
                stack.add(n.right);
            }
            if (n.left != null) {
                stack.add(n.left);
            }
        }
        System.out.println();
    }
    
    // trocando a recursão por pilha.
    public static void inorder(Node n) {
        ArrayList<Node> stack = new ArrayList<Node>();
        stack.add(n);
        while (stack.size() != 0) {
            n = stack.remove(stack.size() - 1);
            System.out.print(n.element + " ");
            if (n.right != null) {
                stack.add(n.right);
            }
            if (n.left != null) {
                stack.add(n.left);
            }
        }
        System.out.println();
    }
    

    static BinaryTree tree = new BinaryTree("A");

    public static void main(String[] args) {

        Node a = tree.getRoot();
        Node b = tree.addLeftChild (a, "B");
        Node c = tree.addrightChild(a, "C");
                 tree.addLeftChild (b, "D");
                 tree.addrightChild(b, "E");
                 tree.addLeftChild (c, "F");
                 tree.addrightChild(c, "G");

        preorder(a);
        inorder(a);
    }

}
