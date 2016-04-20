import edu.princeton.cs.algs4.StdOut;

public class Demo2 {
	
	public static int rank(int key, int[] a) {
		// count number
		int cnt = 0;
		return rank(key, a, 0, a.length - 1, cnt);
	}
	
	public static int rank(int key, int[] a, int lo, int hi, int cnt) {
		cnt++;
		StdOut.printf("%s%-4d%d\n", retract(4*cnt, ' '), lo, hi);
		if (lo > hi) return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid]) return rank(key, a, lo, mid - 1, cnt);
		else if (key > a[mid]) return rank(key, a, mid + 1, hi, cnt);
		else return mid;
	}
	
	// add retract before lo and hi
	public static String retract(int num, char spa) {
		String s = "";
		for (int i = 0; i < num; i++)
			s += spa;
		return s;
	}

	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,7};
		int key = 2;
		StdOut.print(rank(key, a));
	}
	
}
