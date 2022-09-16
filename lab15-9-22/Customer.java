class Customer
{
      String name;
	String city;
	int id;
	static String role="Buyer";
	Customer(String n, String c, int i)
	{
	name = n;
	city = c;
	id = i;
	}
	void printData()
	{
	System.out.println("Name: " +name);
	System.out.println("City: " +city);
	System.out.println("Id: " +id);
	}
	void buyingStuff(String s)
	{
	System.out.println(name + " has bought " +s);
	}
	public static void main(String[] args)
	{
	Customer c1 = new Customer("sufiyan","Kalyan",421);  
      //    Object creation no.1
	Customer c2 = new Customer("owaish","badlapur",801);  
      //    Object creation no.2
	c1.printData();
	c1.buyingStuff("chocalate");
	c2.printData();
	c2.buyingStuff("milk");
	}
}