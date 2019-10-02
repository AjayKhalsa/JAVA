import java.util.Scanner;
 public class reverse
{
	public static void main(String args[])
       {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the four digit  number:\n");
		int a=sc.nextInt();
		int i=1;
		int n=0;
		while(i<=4)
		{
			n=n*10;
			n=n+a%10;
			a=a/10;
			i++;

		}
		System.out.print("reverse of the given number is:"+n);
	}
}
