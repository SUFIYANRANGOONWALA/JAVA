public class Phone {

	String name;
	int ram;
	String color;

	public Phone(int ram, String color, String name) {
		this.name = name;
		this.ram = ram;
		this.color = color;
	}
}







public class Phone main {

	String name;
	int ram;
	String color;

	public dPhone(int ram, String color, String name) {
		this.name = name;
		this.ram = ram;
		this.color = color;
	}
}




public class Palindrome {

   public static boolean validPalindrome(String s) {

       StringBuffer buffer = new StringBuffer(s);
       buffer.reverse();
       String data = buffer.toString();

       if (s.equals(data)) {
           return true;
       }
       return false;
   }
   public static void main(String[] args) {
       String s1 = "level";
       String s2 = "cool";
       String s3 = "Madam";
       String s4 = "Now, sir, a war is won!";
       boolean b1 = validPalindrome(s1);
       boolean b2 = validPalindrome(s2);
       boolean b3 = validPalindrome(s3);
       boolean b4 = validPalindrome(s4);
       System.out.println("is " + s1 + " a palindrome? " + b1);
       System.out.println("is " + s2 + " a palindrome? " + b2);
       System.out.println("is " + s3 + " a palindrome? " + b3);
       System.out.println("is " + s4 + " a palindrome? " + b4);


   }
}







public class Animal
{
  public void animalsound()
  { 
    System.out.println("Animal makes sound like");
  }
}










public class cat extends Animal
{
  public void animalsound()
  {
     System.out.println("cat sounds like: meow meow");
  }
}  






public class Main_Animal
{
  public static void main(String[] args)
  {
    Animal a = new Animal();
    Animal b = new cat();
    Animal c = new Pig();

    a.animalsound();
    b.animalsound();
    c.animalsound();
  }
}
 






public class Pig extends Animal
{
 public void animalsound()
 { 
   System.out.println("Pig sounds like: wee wee");
 }
}