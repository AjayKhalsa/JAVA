import java.util.Scanner;
abstract class IntStack
{
abstract void push(int n);
abstract int pop();
}
class FixedStack extends IntStack
{
int arr[]=new int[10];
int top=-1;
void push(int n)
{
if(top==9)
System.out.println("OverFlow");
else
{
top++;
arr[top]=n;
}
}
int pop()
{
int n;
if(top==-1)
{
System.out.println("Underflow");
return -1;
}
else
{
n=arr[top];
top--;
return n;
}
}
public static void main(String [] Args)
{
Scanner sc=new Scanner(System.in);
FixedStack fs=new FixedStack();
int choice;
do
{
System.out.println("Enter \n1:Add Element \n2:Remove Element \n3:Display \n4:EXIT");
choice=sc.nextInt();
int n;
switch(choice)
{
case 1:
System.out.println("Enter element to add");
n=sc.nextInt();
fs.push(n);
break;
case 2:
n=fs.pop();
if(n!=-1)
System.out.println("Element deleted "+n);
break;
case 3:
System.out.println("Elements are");
if(fs.top!=-1)
{
for(int i=0;i<=fs.top;i++)
System.out.print(fs.arr[i]+"\t");
System.out.println();
}
else
System.out.println("Empty");
break;
case 4:
break;
default:
System.out.println("Invalid Input");
}
}while(choice!=4);
}
}