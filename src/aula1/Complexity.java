package aula1;

import java.io.*;

public class Complexity {

    public static int f(int n) {

        // o(n) x o(n) = o(n²)
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c++;
            }
        }

        // log n
        for (int j = n; j > 0; j /= 2) {
            c++;
        }

        return c;
    }

    public static void main(String[] args) {
        try {
            FileWriter fstream = new FileWriter("complex.csv");
            BufferedWriter out = new BufferedWriter(fstream);
            for (int k = 1; k <= 200; k++) {
                out.write(k + ";" + f(k) + '\n');
            }
            out.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
