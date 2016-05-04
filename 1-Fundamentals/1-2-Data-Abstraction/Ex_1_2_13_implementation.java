import java.util.Date;

public class Transaction {

	private final String name;
	private final Date date;
	private final double amount;
	
	public Transaction(String n, Date d, double a) {
		name = n;
		date = d;
		amount = a;
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
		return name() + "\n" + date() + "\n" + amount();
	}
}
