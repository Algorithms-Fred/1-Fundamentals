import edu.princeton.cs.algs4.StdOut;

public class Demo2 {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		// assign 1 to arr[i][j] when j is even
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				if(j % 2 == 0)
				arr[i][j] = 1;
			}
		// print sooner result
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				StdOut.print(arr[i][j]+" ");
			}
			StdOut.println();
		}
		StdOut.println("--------------");
		// exchange row and line
		for (int i = 0; i < arr.length; i++)
			for (int j = 0; j < arr[i].length; j++) {
				if(j > i) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		// print later result
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				StdOut.print(arr[i][j]+" ");
			}
			StdOut.println();
		}
	}
	
}
