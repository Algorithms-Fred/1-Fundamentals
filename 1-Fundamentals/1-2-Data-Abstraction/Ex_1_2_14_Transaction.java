import java.util.Date;

public class Ex_1_2_14_Transaction {

	private final String name;
	private final Date date;
	private final double amount;
	
	public Ex_1_2_14_Transaction(String n, Date d, double a) {
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
