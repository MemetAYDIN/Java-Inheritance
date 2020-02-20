package inharetinace;

public class Test {

	public static void main(String[] args) {
		
		Customer customer=new Customer(301,"Cem","Karaca",5430);
		customer.setEmailAddress("cem@gmail.com");
	
		
		
		Person person=new  Customer(302,"Barış","Manço",6360);
		person.setEmailAddress("baris@gmail.com");
 
		Supplier supplier=new  Supplier(701,"Neşet","Ertaş",8625);
		supplier.setEmailAddress("neset@gmail.com");
		
		System.out.println(customer.getGreeting()+" "+customer.getFullName());
		System.out.println(person.getGreeting()+" "+person.getFullName());
		System.out.println(supplier.getGreeting()+" "+supplier.getFullName());
		
		sendMail(customer);
		sendMail(person);
		sendMail(supplier);
	    
	    //Kullanılmamması gerkir aslında abstract varsa doğru bir yapıda
	    if(person instanceof Customer)
	    {
	    	Customer customerPerson=(Customer)person;
	    	customerPerson.setCustomerid(302);
	    	customerPerson.setTotalDebit(6360);
	    }
		
	}
	
	private static void sendMail(Person person)
	{
		System.out.println();
		System.out.println("Kime "+person.getEmailAddress());
		System.out.println("Kime "+person.getGreeting());
		System.out.println("Kime "+person.getFullName());
	}
	

}
