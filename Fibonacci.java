import java.util.Scanner;
class Fibonacci
{
  public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
    	 System.out.println("Enter n");
		int x=in.nextInt();
		int a=0,b=1,c=0;
		for(int i=0;i<=x;i++)
		{

		 System.out.print("\n"+a);
		 c=a+b;
		 a=b;
		 b=c;
		 }
	}
}
