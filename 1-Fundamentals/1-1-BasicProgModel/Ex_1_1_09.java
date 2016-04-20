public class Demo2 {
	
	public static void main(String[] args) {
		
		//Integer.toBinaryString()
		String s = "";
		int N = 156;
		for (int i = N; i > 0; i /= 2) {
			s = (i % 2) + s;
		}
		StdOut.print(s);
		
	}
	
}
