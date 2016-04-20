import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Demo2 {
	
	public static void main(String[] args) {

		if (!StdIn.isEmpty()) {
			double x = Double.parseDouble(args[0]);
			double y = Double.parseDouble(args[1]);
			if ((x > 0 && x < 1) && (y > 0 && y < 1))
				StdOut.print("ture");
			else StdOut.print("false");
		}
		
	}
	
}
