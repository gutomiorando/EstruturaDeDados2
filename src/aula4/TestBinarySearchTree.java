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
public class TestBinarySearchTree {
    
    public static void main(String[] args) {
        
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.contains("4"));
        System.out.println(bst.contains("5"));
        System.out.println(bst.contains("6"));
        System.out.println(bst.contains("7"));
    }
    
    //no pior caso o(log n)
    
}
