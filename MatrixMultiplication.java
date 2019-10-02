import java.util.Scanner;

public class MatrixMultiplication

{

public static void main(String[] args)

{ Scanner sc = new Scanner(System.in);

System.out.println("Enter the no. of rows of first matrix");

int rows1 = sc.nextInt();

System.out.println("Enter the no. of columns of first matrix");

int cols1 = sc.nextInt();

int matrix1[][] = new int[rows1][cols1];

System.out.println("Enter the elements: ");

for(int i=0;i<rows1;i++)

{for(int j=0;j<cols1;j++)

{matrix1[i][j] = sc.nextInt();

}

}

System.out.println("Printing the input matrix l:");

for(int i=0;i<rows1;i++)

{for(int j=0;j<cols1;j++)

{System.out.print(matrix1[i][j]+"\t");}

System.out.println();

}

System.out.println("Enter the no. of rows of the second matrix");

int rows2=sc.nextInt();

System.out.println("Enter the no. of columns of second matrix");

int cols2=sc.nextInt();

int matrix2[][]=new int[rows2][cols2];

System.out.println("Enter the elements");

for(int i=0;i<rows2;i++)

{for(int j=0;j<cols2;j++)

{matrix2[i][j]=sc.nextInt();

}}

System.out.println("Printing input matrix 2");

for(int i=0;i<rows2;i++)

{for(int j=0;j<cols2;j++)

{System.out.print(matrix2[i][j]+"\t");}

System.out.println();

}

//Check multiplication is possible or not

if(cols1!=rows2)

{System.out.println("Multiplication is not possible");

}

else

{ int matrix3[][]=new int[rows1][cols2];

for(int i=0;i<rows1;i++)

{for(int j=0;j<cols2;j++)

{matrix3[i][j]=0;

for(int k=0;k<cols1;k++)

{matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];}

}

}

System.out.println("Printing the resultant matrix 3:");

for(int i=0;i<rows1;i++)

{for(int j=0;j<cols2;j++)

{System.out.print(matrix3[i][j]+"\t");}

System.out.println();

}}}}
