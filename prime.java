import java.util.Scanner;
public class prime
{
  public static void main(String args[])
   {
      System.out.println("Enter the number:");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i;
      for(i=2;i<=n;i++)
          {
           int b=n%i;
           if(b==0)
           break;
          }
      if(i==n)
          System.out.println("Prime Number");
      else
         System.out.println("Not a prime number");
   }
}
