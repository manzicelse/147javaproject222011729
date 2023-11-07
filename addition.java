import java.util.*;
public class addition {
    public void sum()
        {
int a;
int b;
Scanner sc=new Scanner(System.in);
System.out.print("enter first number : ");
a=sc.nextInt();
System.out.print("enter second number : ");
b=sc.nextInt();
int s=a+b;
System.out.print("sum of "+a+"and "+b+" is = "+s);
}
public static void main(String ar[])
{
    addition add=new addition();
    add.sum();
}
}
