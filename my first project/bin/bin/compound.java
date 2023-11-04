
public class compound 
{
    public double comp(double r,double n,double t,double p)
    {
        return p*Math.pow(1+(r/n),(n*t));
    }
    public static void main(String args[])
    {
        compound cp=new compound();
double rt=0.18;
double pr=500000;
double nn=12;
double tm=3;
double result=cp.comp(rt,nn,tm,pr);
System.out.println("the compound interest of bob is="+result);
    }
}
