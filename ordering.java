import java.util.*;
public class ordering {
    public void sign()
    {
        Scanner sa=new Scanner(System.in);
        String name;
        System.out.println("enter your name");
        name=sa.next();
        System.out.println("enter your password");
        double pas;
        pas=sa.nextDouble();
    }
    
}
class menu extends ordering
 {
    public void mymen()
    {
        Scanner sm=new Scanner(System.in);
        String product;
        System.out.println("enter product name");
        product=sm.next();
        System.out.println("enter your diserd number of product");
        double no;
        no=sm.nextDouble();
    }
    
}
 class address extends menu {
    public void myadd()
    {
        Scanner sd=new Scanner(System.in);
        String n;
        System.out.println("enter your coutry name");
        n=sd.next();
        System.out.println("enter your street address");
        double p;
        p=sd.nextDouble();
    } 
}
 interface confs
{
public void  confirm();
}
 class conff extends ordering implements confs
{
public void conf()
{
    Scanner sc=new Scanner(System.in);
    String choice;
    String em;
    System.out.println("enter your email");
    em=sc.next();
    System.out.println("enter your choise if you have two obtions confirm or cancell the process");
    choice=sc.next();
    System.out.println("thank you for using our website we are going to proced on you email");
}
public static void main(String ar[])
{
conff cn=new conff();
menu mn= new menu();
address ad=new address();
cn.sign();
mn.mymen();
ad.myadd();
cn.conf();
}}