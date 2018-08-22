/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author gustavo.miorando
 */
public class TestBinarySearchTree {

    public static void inorder(Node n) {
        // 1.left
        if (n.left != null) {
            inorder(n.left);
        }
        //2. node
        System.out.println(n.element);

        //3. right
        if (n.right != null) {
            inorder(n.right);
        }
    }

    public static void main(String[] args) {

        //BinarySearchTree bst = new BinarySearchTree("8");

        /*bst.insert("4");
        bst.insert("13");
        bst.insert("3");
        bst.insert("6");
        bst.insert("20");
        bst.insert("14");
        bst.insert("5");*/

        //System.out.println(bst.contains("4"));
        //System.out.println(bst.contains("1"));
        //System.out.println(bst.contains("7"));
        //System.out.println(bst.contains("14"));
        //System.out.println(bst.contains("6"));
        //bst.insert("5");
        //System.out.println(bst.contains("5"));
        //inorder(bst.getRoot());

        int i, n = 1000;
        long start;
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (i = 0; i < n; i++) {
            array.add((int) (Math.random() * n));
        }

        System.out.println("Time sorting " + n + " integers (in seconds)");

        TreeSet<Integer> ts = new TreeSet<Integer>();
        start = System.currentTimeMillis();
        for (int j = 0; j < n; j++) {
            ts.add(array.get(i));
        }
        // treeset
        System.out.println("Tree set: " + (System.currentTimeMillis() - start) / 1000.0);

        BinarySearchTree bstt = new BinarySearchTree(String.valueOf(array.get(0)));
        start = System.currentTimeMillis();
        //BinaySearchTree
        for (int j = 0; j < 10; j++) {
            bstt.insert(String.valueOf(array.get(i)));
        }
        System.out.println("BinarySearchTree:     " + (System.currentTimeMillis() - start) / 1000.0);

    }
}
