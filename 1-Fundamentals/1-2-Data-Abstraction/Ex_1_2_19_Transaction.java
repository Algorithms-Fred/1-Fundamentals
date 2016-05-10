import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_1_2_19_Transaction {

	private String name;
	private Date date;
	private double amount;
	
	public Ex_1_2_19_Transaction(String n, Date d, double a) {
		name = n;
		date = d;
		amount = a;
	}	
	
	public Ex_1_2_19_Transaction(String transaction) {
		
		SimpleDateFormat df = new SimpleDateFormat();
		try {
			String[] fields = transaction.split("\\s+");
			name = fields[0];
			date = df.parse(fields[1]);
			amount = Double.parseDouble(fields[2]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String name() {
		return name;
	}
	
	public Date date() {
		return date;
	}
	
	public double amount() {
		return amount;
	}
	
	public String toString() {
		return name() + "\\s" + date() + "\\s" + amount();
	}
	
	public boolean equals(Object x) {
		if (this == x) return true;
		if (x == null) return false;
		if (this.getClass() != x.getClass()) return false;
		Transaction that = (Transaction) x;
		if (this.name != that.name) return false;
		if (this.date != that.date) return false;
		if (this.amount != that.amount) return false;
		return true;
	}
}
