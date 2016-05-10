import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_15 {
	
	public static int[] histogram(int[] a, int M) {
		
		int[] arr = new int[M];
		for (int j = 0; j < M; j++) {
			// count number
			int cnt = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] == j) cnt++;
			}
			arr[j] = cnt;
		}
		return arr;
		
	}
	
	// get the sum of arr's elements
	public static int sumArr(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// if the elements of a[] are all in (0, M-1), sum(elements) = a.length
		int M = 7;
		int[] a = {0,1,2,3,4,5};
		StdOut.print(sumArr(histogram(a, M)));
	}
	
}

