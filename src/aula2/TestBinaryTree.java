/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author gustavo.miorando
 */
public class TestBinaryTree {
    
    public static void main(String[] args){
        
        /*
        
        Iniciando manualmente
        
        // criando nodo inicial
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        
        // estabelecer a comunicao entre pai e filho.
        // A é o pai. B é o filho da esquerda
        a.left = b;
        b.parent = a;
        
        // liga B e D
        b.right = d;
        d.parent = b;
        
        // liga C e A
        a.right = c;
        d.parent = a;
        */
        
        BinaryTree tree = new BinaryTree("A");
        
        Node a = tree.getRoot();
        Node b = tree.addLeftChild(a, "B");
        Node c = tree.addrightChild(a, "C");
        
        // filho direito de B
        Node d = tree.addrightChild(b, "D");
        
        
        // chama funcao que calcula o nivel do node;
        System.out.println("A = " + tree.depth(a) );
        System.out.println("B = " + tree.depth(b) );
        System.out.println("C = " + tree.depth(c) );
        System.out.println("D = " + tree.depth(d) );
        
        // exemplo da arvore criada
        // A
        
        // B      C
        
        // D
        
        // chama funcao que calcula a altura do node;
        System.out.println("altura de A = " + tree.height(a) );
        System.out.println("altura de B = " + tree.height(b) );
        System.out.println("altura de C = " + tree.height(c) );
        System.out.println("altura de D = " + tree.height(d) );
        
        
        // imprimir toda a arvore
        tree.print(a);
        
    }
    
}
