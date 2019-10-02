class A
{
    void overRide()
    {
          System.out.println("Inside Class A's overRide method");
    }
}

class B extends A
{
    void overRide()
    {
          System.out.println("Inside Class B's overRide method");
    }
}

class C extends A
{
    void overRide()
    {
          System.out.println("Inside Class C's overRide method");
    }
}

class overriding
{
    public static void main(String[] args)
{
A a =new A();
B b =new B();
C c =new C();

A ref;
ref=a;
ref.overRide(); 
ref = b; 
ref.overRide(); 
ref = c; 
ref.overRide(); 

}
}