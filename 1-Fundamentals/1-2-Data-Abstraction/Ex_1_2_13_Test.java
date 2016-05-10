import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Ex_1_2_13_Test {

	public static void main(String[] args) {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			
			String n = args[0];
			Date d = df.parse(args[1]);
			double a = Double.parseDouble(args[2]);
			
			Ex_1_2_13_Transaction t = new Ex_1_2_13_Transaction(n, d, a);
			
			StdOut.println(t);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
