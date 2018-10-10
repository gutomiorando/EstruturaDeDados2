package aula11;

public class Latin3Solver
{
    public static int complete_states;
    public static int partial_states;
    public static int solutions;

    public static void main(String[] args)
    {
        Latin3State start = new Latin3State();
        //start.m[1][1] = 'b';
        //start.m[1][2] = 'b';
        solve(start);
        System.out.println("complete states: " + complete_states);
        System.out.println("partial states : " + partial_states);
        System.out.println("solutions      : " + solutions);
    }
    
    public static boolean solve(final Latin3State state)
    {
        boolean found = false;
        int r = 0, c = 0;
        for (r = 0; r <= 2; r++) {
            for (c = 0; c <= 2; c++) {
                if (state.m[r][c]=='-') {
                    found = true;
                    break;
                }
            }
            if (found) { break; }
        }

        if (!found) { // BASE CASE: matrix is full
            complete_states++;
            System.out.println(state);

            if (state.isValid()) {
                solutions++;
                System.out.println(state);
                return true;
            }
        }
        else { // GENERAL CASE: choose letter to fill an empty position
            partial_states++;
            System.out.println(state);

            Latin3State sa = new Latin3State(state);
            sa.m[r][c] = 'a';
            if (solve(sa) == true) { return true; }

            Latin3State sb = new Latin3State(state);
            sb.m[r][c] = 'b';
            if (solve(sb) == true) { return true; }

            Latin3State sc = new Latin3State(state);
            sc.m[r][c] = 'c';
            if (solve(sc) == true) { return true; }
        }
        return false;
    }
}

