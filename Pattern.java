import java.util.Scanner;
class Pattern
{	
	public static void main(String args[])
		{	int i,j,k,x;
		
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number of rows:");
			x=sc.nextInt();
			for(i=1;i<=x;i++)
				{
					for(j=1;j<=x-i;j++)
						System.out.print(" ");
					
					for(k=1;k<=i;k++)
						System.out.print(k+" ");
						
			System.out.println();
				}
			
		}
}																		
			
			