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
public class ArvoreAritmetica {

    public static void inorder(Node n) {

        if (n.isInternal()) {
            System.out.print("(");
        }
        // 1 - Visitar o Node a esquerda com recursao
        if (n.left != null) {
            inorder(n.left);
        }
        // 2 - Visita o Node
        System.out.print(n.element);
        // 3 - Visitar o Node a direita
        if (n.right != null) {
            inorder(n.right);
        }
        if (n.isInternal()) {
            System.out.print(")");
        }
    }

    public static double postorder(Node n) {

        /*
        if(n.isExternal()){
            double v = Double.parseDouble(n.element);
            return v;
        }
        
        double l = postorder(n.left);
        double r = postorder(n.right);
        
        if(n.element.equals("+")) return l + r;
        else if(n.element.equals("-")) return l - r;
        else if(n.element.equals("*")) return l * r;
        else                           return l / r;
         */
        if (n.left == null && n.right == null) {
            return Double.parseDouble(n.element);
        } else {
            double result = 0.0;
            double left = postorder(n.left);
            double right = postorder(n.right);
            char operator = n.element.charAt(0);

            switch (operator) {
                case '+':
                    result = left + right;
                    break;
                case '-':
                    result = left - right;
                    break;
                case '*':
                    result = left * right;
                    break;
                default:
                    result = left + right;
                    break;
            }
            System.out.print(result);
            return result;
        }
    }

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

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree("+");

        Node a = tree.getRoot();

        Node b = tree.addLeftChild(a, "*");
        Node c = tree.addrightChild(a, "-");

        Node d = tree.addLeftChild(b, "+");
        Node e = tree.addrightChild(b, "5");
        Node f = tree.addLeftChild(c, "8");
        Node g = tree.addrightChild(c, "*");

        tree.addLeftChild(d, "1");
        tree.addrightChild(d, "4");
        tree.addLeftChild(g, "3");
        tree.addrightChild(g, "7");

        //inorder(a);
        //postorder(a);
        System.out.println(postorder(a));

    }
}
