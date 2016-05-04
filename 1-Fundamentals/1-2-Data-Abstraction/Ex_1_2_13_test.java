import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Demo2 {

	public static void main(String[] args) {
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			
			String n = args[0];
			Date d = df.parse(args[1]);
			double a = Double.parseDouble(args[2]);
			
			Transaction t = new Transaction(n, d, a);
			
			StdOut.println(t);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
