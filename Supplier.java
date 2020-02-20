package inharetinace;

public class Supplier extends Person{

	private long suplierId;
	private double totalCrdit;
	
	
	
	
	public Supplier(long suplierId, String firstName, String lastName,  double totalCrdit) {
		super(firstName, lastName);
		this.suplierId = suplierId;
		this.totalCrdit = totalCrdit;
	}
	public long getSuplierId() {
		return suplierId;
	}
	public void setSuplierId(long suplierId) {
		this.suplierId = suplierId;
	}
	public double getTotalCrdit() {
		return totalCrdit;
	}
	public void setTotalCrdit(double totalCrdit) {
		this.totalCrdit = totalCrdit;
	}
	
	@Override
	public String getGreeting()
	{
		return "Selam";
	}
}
