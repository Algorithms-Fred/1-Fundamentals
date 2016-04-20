import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Demo2 {
	
	public static void main(String[] args) {
		if(!StdIn.isEmpty()){
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = Integer.parseInt(args[2]);
			// if a=b=c print equal else print not equal
			if( a == b && b == c)
				StdOut.println("equal");
			else StdOut.println("not equal");
		}
	}
	
}
