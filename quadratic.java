import java.util.Scanner;
 class quadratic
{
  public static Scanner sc;
  public static void main(String[] args)
    
{  
          double a,b,c;
          double r1,r2,imaginary,discriminant;
	      Scanner sc= new Scanner(System.in);
	
	     System.out.print("Please Enter the Values of a,b,c of Quadratic Equation:\n");
	      a=sc.nextDouble();
	      b=sc.nextDouble();
	      c=sc.nextDouble();
	     discriminant=(b*b)-(4*a*c);
	
 	if(discriminant>0)
	{
		r1=(-b + Math.sqrt(discriminant)/(2*a));
	    r2=(-b - Math.sqrt(discriminant)/(2*a));
		System.out.println("\n Two Distinct and real roots exists: root1="+r1+" root2="+r2);
	}
	else if(discriminant==0)
	{
		
		r1=r2=-b/(2*a);
		System.out.println("\n Two Equal and real roots exists: root1="+r1+" root2="+r2);
	}
	else if(discriminant<0)
	{
		
		r1=r2=-b/(2*a);
		imaginary=Math.sqrt(-discriminant)/(2*a);
		System.out.println("\n Two Distinct and Complex roots exists: root1="+r1+"+i" +imaginary+"root2="+r2+"-i"+imaginary);
	}
}
}





