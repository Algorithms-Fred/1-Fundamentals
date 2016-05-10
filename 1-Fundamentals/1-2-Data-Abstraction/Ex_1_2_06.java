import edu.princeton.cs.algs4.StdOut;

public class Ex_1_2_06 {
	
	public static boolean isCircularRotation(String s, String t) {
		
		return s.length() == t.length() && (s + s).contains(t); 
		
	}
	
	public static void main(String[] args) {
		
		String s1 = "TGACGAC";
		String s2 = "ACTGACG";
		
		StdOut.println(isCircularRotation(s1, s2));
		
	}
	
}
