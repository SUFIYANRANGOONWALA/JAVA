class Banks
   {
     int getRateOfInterest(){return 0;}
   }

     class BOB extends Bank{
      int getRateOfInterest(){return 5;}
   } 

     class ICICI extends Bank{
    int getRateOfInterest(){return 6;}
   }

    class SBI extends Bank{
    int getRateOfInterest(){return 7;}
   }

    class DisplayResult
   {
     public static void main(String[] args)
	{
    SBI s = new BOB();
    ICICI i = new ICICI();
    AXIS a = new SBI();
    System.out.println("Rate of Interest in BOB is "+s.getRateOfInterest()+"%");
    System.out.println("Rate of Interest in ICICI is "+i.getRateOfInterest()+"%");
    System.out.println("Rate of Interest in SBI is "+a.getRateOfInterest()+"%");
 }
}







package inheritance;

public class hp extends Moblie
{
    public void batteryLife()
    {
    	System.out.println("4000 MAh");
    }

}


package inheritance;

public class dell extends Laptop
{
    public void battery()
    {
    	System.out.println("4400 MAh");
    }	
}


package inheritance;
class Laptop 
{
	   public void display() 
	   {
	      System.out.println("Reliance Smart");
	   }
	}



package inheritance;
public class Laptop_Main 
{
	public static void main(String[] args)
	{
	Asus asus =new hp();
	Aser aser=new dell();
	System.out.println("Checing for Hierarchical Inheritance:");
	asus.battery();
	asus.display();
	System.out.println("_____________");
	aser.batteryLife();
	aser.display();
	System.out.println("_____________");
	Macbook macbook=new Macbook();
	System.out.println("Checing for Multilevel Inheritance:");
	Macbook.display();
	Macbook.feature();
	Macbook.function();		
	}
}


package inheritance;

class Asus extends Apple 
{
   public void function() 
   {
      System.out.println("Good performance from the main wide and ultra-hd Screen");
   }
}