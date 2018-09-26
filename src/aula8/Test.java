package aula8;

public class Test {

    public static int solutions, states = 0;

    public static void main(String[] args) {
        tuple(4, "");
        System.out.println("states    = " + states);
        System.out.println("solutions = " + solutions);
    }

    public static boolean tuple(int n, String s) {
        if (n == 0) {
            states++;
            int x = Integer.parseInt(s, 16);
            if(x % 3 == 0){ // se nao entrar a sequencia nao é multipla de 3
                System.out.println(s);    
                solutions++;
                return true; // se comentar o return, vai passar pór tudo.
            } 
        } else {
            if(tuple(n - 1, s + "a") == true) {
                return true;
            }
            if(tuple(n - 1, s + "b") == true) {
                return true;
            }
            if(tuple(n - 1, s + "c") == true) {
                return true;
            }
            if(tuple(n - 1, s + "d") == true) {
                return true;
            }
            
        }
        return false;
    }
}
