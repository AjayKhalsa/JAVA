import java.util.Scanner;
class Operators
{
  public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
	System.out.println("Enter x");
    int x=in.nextInt();
  System.out.println("Enter y");
		int y=in.nextInt();

		System.out.println(x+"+"+y+"="+(x+y));
		System.out.println(x+"-"+y+"="+(x-y));
		System.out.println(x+"*"+y+"="+(x*y));
		System.out.println(x+"/"+y+"="+(x/y));
		System.out.println(x+"%"+y+"="+(x%y));
	}
}
