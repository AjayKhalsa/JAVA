import java.util.Scanner;

public class TraceNorm

{

public static void main(String args[])

{

Scanner sc = new Scanner(System.in);

System.out.println("Enter the no. of rows and columns : \n");

int m = sc.nextInt();

int n = sc.nextInt();

System.out.println("Enter the elements of array");

int a[][] = new int[10][10];

int i,j=0;

int trace = 0;

double norm=0;

int sum = 0;

for (i = 0; i<m; i++)

{

for (j = 0; j<n; j++)

{

a[i][j] = sc.nextInt();

if (i == j)

{

trace = trace + a[i][j];

}

sum = sum +a[i][j];

norm = Math.sqrt(sum);

}

}

System.out.println("Trace = " + trace);

System.out.println(" Norm = " + norm);

}

}
