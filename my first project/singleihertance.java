import java.util.*;
public class singleihertance {
    public void addition()
    {
    int a;
    int b;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter first  number");
    a=sc.nextInt();
    System.out.print("enter second  number");
    b=sc.nextInt();
     System.out.println("the sum of those two numbers is = "+(a+b));
    }}
     class AAa extends singleihertance
    {
        public void mult()
        {
            Scanner s=new Scanner(System.in);
int x;
int y;
System.out.println("this is the method for multiplication");
System.out.print("enter first   number for multplication");
y=s.nextInt();
System.out.print("enter second  number for multiplication");
x=s.nextInt();
System.out.println("the multiple of "+x+"and"+y+"is "+(x*y));
        } 
    
    public static void main(String ar[])
    {
AAa a=new AAa();
System.out.println("this is the method in the main class");
a.addition();
System.out.println("this the method in the child class");
a.mult();
    }}

