import edu.princeton.cs.algs4.StdOut;

public class Demo2 {
	
	public static void main(String[] args) {
		
		boolean[][] arr = new boolean[20][20];
		// assigns true to arr[i][j] when j is even
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				if(j % 2 == 0)
				arr[i][j] = true;
			}
		// replaces true with * and false with " " , prints a result
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == true)
				StdOut.print("*");
				else StdOut.print(" ");
			} 
			StdOut.println();
		}
	}
	
}
