import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Demo2 {

	public static int[] readInts(String name) {
		
		In in = new In(name);
		String input = in.readAll();
		String[] words = input.split("\\s+");
		int[] ints = new int[words.length];
		for(int i = 0; i < words.length; i++) {
			ints[i] = Integer.parseInt(words[i]);
		}
		return ints;
	}
	
	public static void main(String[] args) {
		
		String name = "C:\\Users\\Fred\\workspace\\algs4-data\\tinyT.txt";
		for (int i : readInts(name)) {
			StdOut.println(i);
		}
		
	}

}
