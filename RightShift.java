class RightShift
{
	public static void main(String args[])
		{
		  System.out.println("Demonstrating signed right shift operator");
		  int a=60;
		  System.out.println("before shift in decimal="+a);
		  System.out.println("before shift in binary="+Integer.toBinaryString(a));
		  System.out.println("a=a>>2");
		  a=a>>2;

		  System.out.println("after shift in decimal="+a);
		  System.out.println("after shift in binary="+Integer.toBinaryString(a));
		  System.out.println();
		  //negative number for signed right shift
		  int b=-120;
		  System.out.println("before shift in decimal="+b);
		  System.out.println("before shift in binary="+Integer.toBinaryString(b));
		  System.out.println("b=b>>2");
		  b=b>>2;

		  System.out.println("after shift in decimal="+b);
		  System.out.println("after shift in binary="+Integer.toBinaryString(b));

		  System.out.println();
		  System.out.println("Demonstrating unsigned right shift operator");
		  int c=60;
		  System.out.println();
		  System.out.println("before shift in decimal="+c);
		  System.out.println("before shift in binary="+Integer.toBinaryString(c));
		  System.out.println("c=c>>>2");
		  c=c>>>2;

		  System.out.println("after shift in decimal="+c);
		  System.out.println("after shift in binary="+Integer.toBinaryString(c));
		  System.out.println();

		  int d=-120;
		  System.out.println("before shift in decimal="+d);
		  System.out.println("before shift in binary="+Integer.toBinaryString(d));
		  System.out.println("d=d>>>2");
		  d=d>>>2;

		  System.out.println("after shift in decimal="+d);
		  System.out.println("after shift in binary="+Integer.toBinaryString(d));






		}
}
