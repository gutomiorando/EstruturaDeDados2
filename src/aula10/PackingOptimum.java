public class PackingOptimum
{
	public static int states = 0;
	public static double best_val = 1000;
	public static String best_str = "";

	public static void main(String[] args) {
		permutation(10, "");
		System.out.println("states=" + states);
		System.out.println("best_val=" + best_val);
		System.out.println("best_str=" + best_str);
	}

	public static double evaluate(String s) {
		int boxes = 1, current = 0, item = 0;
		for (char c : s.toCharArray()) {
			if (c == 'a') { item = 5;  }
			if (c == 'b') { item = 17; }
			if (c == 'c') { item = 3;  }
			if (c == 'd') { item = 11; }
			if (c == 'e') { item = 8;  }
			if (c == 'f') { item = 12; }
			if (c == 'g') { item = 4;  }
			if (c == 'h') { item = 9;  }
			if (c == 'i') { item = 15; }
			if (c == 'j') { item = 16; }
			if (current + item <= 25) { current += item; }
      else { boxes++; current = item; }
		}
		return boxes;
	}

	public static void permutation(int n, String s) {
		if (n == 0) {
			states++;
			double v = evaluate(s);
			if (v < best_val) {
				best_val = v;
				best_str = s;
			}
		}
	  else {
  		if (! s.contains("a")) { permutation(n - 1, s + "a"); }
	  	if (! s.contains("b")) { permutation(n - 1, s + "b"); }
	  	if (! s.contains("c")) { permutation(n - 1, s + "c"); }
	  	if (! s.contains("d")) { permutation(n - 1, s + "d"); }
	  	if (! s.contains("e")) { permutation(n - 1, s + "e"); }
	  	if (! s.contains("f")) { permutation(n - 1, s + "f"); }
	  	if (! s.contains("g")) { permutation(n - 1, s + "g"); }
	  	if (! s.contains("h")) { permutation(n - 1, s + "h"); }
	  	if (! s.contains("i")) { permutation(n - 1, s + "i"); }
	  	if (! s.contains("j")) { permutation(n - 1, s + "j"); }
		}
	}
}

