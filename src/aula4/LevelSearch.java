/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import static java.time.Clock.system;
import java.util.ArrayList;

/**
 *
 * @author gustavo.miorando
 */
public class LevelSearch {

    static BinaryTree tree = new BinaryTree("A");

    public static void main(String[] args) {

        //BinaryTree tree = new BinaryTree("A");
        //Node a = tree.getRoot();
        //Node b = tree.addLeftChild(a, "B");
        //Node c = tree.addrightChild(a, "C");
        //Node d = tree.addrightChild(b, "D");
        //System.out.println("Level:");
        //level(a);
        
        
        // ----
        Node a = tree.getRoot();
        Node b = tree.addLeftChild(a, "B");
        Node c = tree.addrightChild(a, "C");
        Node d = tree.addLeftChild(b, "D");        
        Node e = tree.addrightChild(b, "E");
        Node f = tree.addLeftChild(c, "F");
        Node g = tree.addrightChild(c, "G");

        

        //vis1(a);
        //vis2(a);
        svg_star();
        svg(a, 200, 30);
        svg_finish();
    }

    public static void level(Node n) {
        ArrayList<Node> queue = new ArrayList<Node>();

        //fila esta vazia, colocar referencia para raiz(n)
        queue.add(n);

        // fila está vazia? Faz algo, se nao estiver para
        while (queue.size() != 0) {

            // remove o elemente, e os outros passam 1 posicao para esquerda
            n = queue.remove(0);
            System.out.println(n.element); // que estou tirando da fila
            if (n.left != null) {          // testa se ele tem um filho a esquerda, se tiver adiciona na fila.
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);        // testa se ele tem um filho a esquerda, se tiver adiciona na fila.
            }

            // volta pro inicio, e verifica se tem alguem na fila.
        }

    }

    public static void vis1(Node n) {
        ArrayList<Node> queue = new ArrayList<Node>();
        queue.add(n);
        while (queue.size() != 0) {
            n = queue.remove(0);
            for (int i = 0; i < tree.depth(n); i++) {
                System.out.print(" ");
            }
            System.out.println(n.element);
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
    }

    public static void vis2(Node n) {
        ArrayList<Node> queue = new ArrayList<Node>();
        queue.add(n);
        int old_level = tree.depth(n);
        while (queue.size() != 0) {
            n = queue.remove(0);
            if (tree.depth(n) != old_level) {
                System.out.println();
                old_level = tree.depth(n);
            }
            System.out.print(n.element + " ");
            if (n.left != null) {
                queue.add(n.left);
            }
            if (n.right != null) {
                queue.add(n.right);
            }
        }
    }
    
    public static void svg_star(){
        
        
        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
        System.out.println("<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\"400\" height=\"400\">");
        System.out.println();
        
        System.out.println("  <style type=\"text/css\">");
        System.out.println("    .label { font: normal 24px sans-serif; stroke-width: 0; fill: black }");
        System.out.println("  </style>");
        System.out.println();
        
        System.out.println("  <g stroke=\"black\" stroke-width=\"2\">");
        System.out.println("    <circle cx=\"0\"   cy=\"0\"   r=\"20\" fill=\"red\" />");
        System.out.println("    <circle cx=\"400\" cy=\"0\"   r=\"20\" fill=\"green\" />");
        System.out.println("    <circle cx=\"0\"   cy=\"400\" r=\"20\" fill=\"blue\" />");
        System.out.println("    <circle cx=\"400\" cy=\"400\" r=\"20\" fill=\"yellow\" />");
    }
    
    
    public static void svg(Node n, int x, int y){
        
        int leftx = x - 40;
        int lefty = y + 60;
        int rightx = x + 40;
        int rigthy = y + 60;
        
        // se tem o esquerdo
        if(n.left != null){
            System.out.println("<line   x1=\""+ x + "\" y1=\"" + y + "\" x2=\"" + leftx + "\" y2=\"" + lefty + "\" />;");
        }
        
        // se tem o direito
        if(n.right != null){
            System.out.println("<line   x1=\""+ x + "\" y1=\"" + y + "\" x2=\"" + rightx + "\" y2=\"" + rigthy + "\" />;");
        }
        
        System.out.println("    <circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"20\" fill=\"#55cccc\" />");
        
        if(n.left != null ){
            svg(n.left, leftx, lefty);
        }
        if(n.right != null ){
            svg(n.right, rightx, rigthy);
        }
        
        
    }
    
    public static void svg_finish(){
        System.out.println("  </g>");
        System.out.println("</svg>");
    }
    
    
}
