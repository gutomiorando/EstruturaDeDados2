package aula11;

public class Latin3State
{
    public char[][] m = {{'-','-','-'},
                         {'-','-','-'},
                         {'-','-','-'}};

    public Latin3State() {}

    public Latin3State(Latin3State s) {
        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                this.m[r][c] = s.m[r][c];
            }
        }
    }

    private boolean colIsValid(int col) {
        int a = 0, b = 0, c = 0;
        for (int row = 0; row <= 2; row++) {
           if (this.m[row][col] == 'a') { a++; }
           if (this.m[row][col] == 'b') { b++; }
           if (this.m[row][col] == 'c') { c++; }
        }
        return a <= 1 && b <= 1 && c <= 1;
    }

    private boolean rowIsValid(int row) {
        int a = 0, b = 0, c = 0;
        for (int col = 0; col <= 2; col++) {
           if (this.m[row][col] == 'a') { a++; }
           if (this.m[row][col] == 'b') { b++; }
           if (this.m[row][col] == 'c') { c++; }
        }
        return a <= 1 && b <= 1 && c <= 1;
    }

    public boolean isValid() {
        return colIsValid(0) && colIsValid(1) &&
               colIsValid(2) && rowIsValid(0) &&
               rowIsValid(1) && rowIsValid(2);
    }

    public String toString() {
        return 
           m[0][0]+" "+m[0][1]+" "+m[0][2]+"\n" +
           m[1][0]+" "+m[1][1]+" "+m[1][2]+"\n" +
           m[2][0]+" "+m[2][1]+" "+m[2][2]+"\n";
    }
}

