public class simpleinterest
{
    public double interes(double p,double r,double t)
    {
        return (p*r*t/100);
    }
    public static void main(String args[])
    {

        simpleinterest si=new simpleinterest();
        double pr=100000;
        double rt=5;
        double tm=5;
        double result=si.interes(pr,rt,tm);
        System.out.print("bob's semple interest is="+""+result);


}}