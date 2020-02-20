package inharetinace;

public class Customer extends Person{
	
	private int customerid;
	private double totalDebit;
	public int getCustomerid() {
		return customerid;
	}
	
	
	public Customer(int customerid, String firstName, String lastName,  double totalDebit) {
		super(firstName, lastName);
		this.customerid = customerid;
		this.totalDebit = totalDebit;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public double getTotalDebit() {
		return totalDebit;
	}
	public void setTotalDebit(double totalDebit) {
		this.totalDebit = totalDebit;
	}
	
	@Override
	public String getFullName()
	{
		//return "Sayın "+ super.getFullName();
		return lastName+","+firstName;
	}
	
	@Override
	public String getGreeting()
	{
		return "Merhaba";
	}

}
