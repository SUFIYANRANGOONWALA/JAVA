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