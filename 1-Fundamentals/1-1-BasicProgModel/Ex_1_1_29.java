import edu.princeton.cs.algs4.StdOut;

public class Demo2 {

	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length-1);
	}
		
	// return the number of elements that are smaller than the key
	public static int rank(int key, int[] a, int lo, int hi) {
		int num = 0;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key > a[mid]) lo = mid + 1;
			else if (key < a[mid]) hi = mid - 1;
			else {
				for(int i = 0; i < a.length; i++){
					if (a[i] < a[mid]) num++;
				}
				return num;
			}
		}
		return num;
	}
	// return the number of elements equal to the key	
	public static int count(int key, int[] a, int lo, int hi) {
		int num = 0;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key > a[mid]) lo = mid + 1;
			else if (key < a[mid]) hi = mid - 1;
			else {
				for(int i = 0; i < a.length; i++){
					if (a[i] == a[mid]) num++;
				}
				return num;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		
		int key = 1;
		int[] a = {1,1,1,2,2,3,3};
		StdOut.println(rank(key, a));
		StdOut.print(count(key, a, 0, a.length));
	}
	
}
