/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author gustavo.miorando
 */
public class BinarySearchTree {

    private BinaryTree tree;

    public BinarySearchTree() {
        this.tree = new BinaryTree("8");
        Node a = tree.getRoot();
        Node b = tree.addLeftChild(a, "4");
        Node c = tree.addrightChild(a, "13");
        tree.addLeftChild(b, "3");
        tree.addrightChild(b, "6");
        Node d = tree.addrightChild(c, "20");
        tree.addLeftChild(d, "14");

    }

    public boolean contains(String s) {
        Node n = this.tree.getRoot();  // buscar a raiz

        while (n != null) {
            if (n.element.equals(s)) { // o elemento que eu ja tenho(raiz), é o que eu procuro
                return true; // se for ja retora
            }

            // se nao for tem que ver se vou para a direita ou para a esquerda.
            if (Double.parseDouble(s) < Double.parseDouble(n.element)) {
                n = n.left; // estou indo para a esquerda
            } else {
                // se nao for, tenho que ir para a direita
                n = n.right;
            }
        }
        return false;
    }
}
