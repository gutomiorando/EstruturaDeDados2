/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobacktracking;

/**
 *
 * @author Lucas
 */
public class ProjetoBacktracking {

    public static final int ROW_SIZE = 7;
    public static final int COL_SIZE = 10;

    public static int count = 0;

    private static boolean solve(Tabuleiro state) {
        count++;
        System.out.println(state);

        // get current position, from left to rigth and up to down
        boolean found = false;
        int r = 0xBEBA, c = 0xCAFE;
        for (r = 1; r < ROW_SIZE - 1; r++) {
            for (c = 1; c < COL_SIZE - 1; c++) {
                if (state.get(r, c) == 0) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) { // entra quando o quadrado está todo preenchido
            return true;
        }

        // Peça A = 22
        if (state.get(r, c + 1) == 0) {
            Tabuleiro t = new Tabuleiro(state);
            t.set(r, c, 2);
            t.set(r, c + 1, 2);
            if (solve(t) == true) {
                return true;
            }
        }
        // Peça B = 3
        //          3
        if (state.get(r + 1, c) == 0) {
            Tabuleiro t = new Tabuleiro(state);
            t.set(r, c, 3);
            t.set(r + 1, c, 3);
            if (solve(t) == true) {
                return true;
            }
        }
        //Peça c = 4
        //         4 4
        if (state.get(r + 1, c) == 0 && state.get(r + 1, c + 1) == 0) {
            Tabuleiro t = new Tabuleiro(state);
            t.set(r, c, 4);
            t.set(r + 1, c, 4);
            t.set(r + 1, c + 1, 4);
            if (solve(t) == true) {
                return true;
            }
        }
        //Peça D = 5 5
        //           5
        if (state.get(r, c + 1) == 0 && state.get(r + 1, c + 1) == 0) {
            Tabuleiro t = new Tabuleiro(state);
            t.set(r, c, 5);
            t.set(r, c + 1, 5);
            t.set(r + 1, c + 1, 5);
            if (solve(t) == true) {
                return true;
            }
        }

        //Peça E = 6 6
        //         6
        if (state.get(r + 1, c) == 0 && state.get(r, c + 1) == 0) {
            Tabuleiro t = new Tabuleiro(state);
            t.set(r, c, 6);
            t.set(r + 1, c, 6);
            t.set(r, c + 1, 6);
            if (solve(t) == true) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int num = Entrada.leiaInt("Digite um numero de 1 à 5 para escolha de um tabuleiro");
        if (num < 1 || num > 5) {
            System.out.println("Numeto inválido");
        } else {
            Tabuleiro tabuleiro = new Tabuleiro(num);

            long start = System.currentTimeMillis();

            if (solve(tabuleiro)) {
                System.out.println("Solved");
            } else {
                System.out.println("Can't solve");
            }

            System.out.println("count: " + count);
            System.out.println("time: " + (System.currentTimeMillis() - start) / 1000.0 + " seconds");
        }
    }

}
