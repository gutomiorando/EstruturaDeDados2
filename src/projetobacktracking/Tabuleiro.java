/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobacktracking;

import static projetobacktracking.ProjetoBacktracking.*;

/**
 *
 * @author Lucas
 */
public final class Tabuleiro {
    int num = 0;
    // Tabuleiro
    private int[][] tab = {{ 1,1,1,1,1,1,1,1,1,1 },
                            { 1,0,0,0,0,0,0,0,0,1 },
                            { 1,0,0,0,0,0,0,0,0,1 },
                            { 1,0,0,0,0,0,0,0,0,1 },
                            { 1,0,0,0,0,0,0,0,0,1 },
                            { 1,0,0,0,0,0,0,0,0,1 },
                            { 1,1,1,1,1,1,1,1,1,1 }};;
    
    // posição inicial
    private int row = 1, col = 1;
    
    public Tabuleiro(){}
    
    public Tabuleiro(int numero)
    {
        
        if (numero == 1) { 
                int tabuleiro[][] = {{ 1,1,1,1,1,1,1,1,1,1 },
                                     { 1,0,0,0,0,0,0,0,0,1 },
                                     { 1,1,0,0,0,0,0,1,1,1 },
                                     { 1,0,0,0,0,0,0,0,1,1 },
                                     { 1,0,0,1,0,0,0,0,0,1 },
                                     { 1,0,0,0,0,0,0,0,0,1 },
                                     { 1,1,1,1,1,1,1,1,1,1 }};
                copyTabuleiro(tabuleiro);
        }else if(numero == 2){
            int tabuleiro[][] = {{ 1,1,1,1,1,1,1,1,1,1 },
                                { 1,0,0,1,0,0,1,0,0,1 },
                                { 1,0,1,1,0,0,1,1,0,1 },
                                { 1,1,1,1,0,0,1,1,1,1 },
                                { 1,0,1,1,0,0,1,0,0,1 },
                                { 1,0,0,1,0,0,1,0,0,1 },
                                { 1,1,1,1,1,1,1,1,1,1 }};
            copyTabuleiro(tabuleiro);
        }else if(numero == 3){
            int tabuleiro[][] = {{ 1,1,1,1,1,1,1,1,1,1 },
                                { 1,0,1,1,0,0,0,0,0,1 },
                                { 1,0,0,1,0,0,0,0,0,1 },
                                { 1,0,0,0,0,0,0,0,0,1 },
                                { 1,0,1,1,0,0,0,1,1,1 },
                                { 1,0,0,0,0,0,0,0,0,1 },
                                { 1,1,1,1,1,1,1,1,1,1 }};
            copyTabuleiro(tabuleiro);
        }else if(numero == 4){
            int tabuleiro[][] = {{ 1,1,1,1,1,1,1,1,1,1 },
                                { 1,0,0,0,1,1,1,0,0,1 },
                                { 1,0,0,0,0,0,0,0,0,1 },
                                { 1,0,0,1,0,0,0,0,0,1 },
                                { 1,1,0,0,0,1,0,0,0,1 },
                                { 1,0,0,0,0,0,0,0,1,1 },
                                { 1,1,1,1,1,1,1,1,1,1 }};
            copyTabuleiro(tabuleiro);
        }else if(numero == 5){
            int tabuleiro[][] = {{ 1,1,1,1,1,1,1,1,1,1 },
                                { 1,0,0,0,0,0,0,0,0,1 },
                                { 1,0,0,0,0,1,1,1,0,1 },
                                { 1,0,0,0,0,1,0,1,0,1 },
                                { 1,0,0,0,0,1,1,1,0,1 },
                                { 1,0,0,0,0,0,0,0,0,1 },
                                { 1,1,1,1,1,1,1,1,1,1 }};
            copyTabuleiro(tabuleiro);
        }
    }
    
    public Tabuleiro(Tabuleiro t){
        for (int r=0; r< ROW_SIZE; r++){
            for (int c = 0; c < COL_SIZE; c++) {
                this.tab[r][c] = t.tab[r][c]; 
            }
        }
        this.row = t.row;
        this.col = t.col;
    }
    
    public void copyTabuleiro(int tabuleiro[][]){
        for (int r=0; r< ROW_SIZE; r++){
            for (int c = 0; c < COL_SIZE; c++) {
                this.tab[r][c] = tabuleiro[r][c]; 
            }
        }
    }
    
    public int get(int r, int c){
        return this.tab[r][c];
    }
    public int getRow(){
        return this.row;
    } 
    public int getCol(){
        return this.col;
    }
    
    public void set(int r, int c, int v){
        this.tab[r][c] = v;
    }
    public void setRow(int r){
        this.row = r;
    }
    public void setCol(int c){
        this.col = c;
    }
    
    @Override
    public String toString(){
        String s = "";
        for (int r = 0; r < ROW_SIZE; r++){
            for (int c = 0; c < COL_SIZE; c++){
                s += this.tab[r][c];
                s += " ";
            }
            s += '\n';
        }
        return s;
    }
    
}
