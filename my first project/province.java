public class province {
    public void myprov()
    {
        String name="western";
        int nofdistr=7;
        System.out.println("your province is: "+name+"thenumber of district = "+nofdistr);
    }
}
 class district  extends province
 {
 public void mydist()
 {
    String dnm="nyamasheke";
    int nofsect=15;
    System.out.println("your district is: "+dnm+"thenumber of sector = "+nofsect);
 }
 }
 class sector  extends district
{
    public void myc()
    {
        String sec="nyamabuye";
        int nofcel=8;
        System.out.println("your sect is: "+sec+"thenumber of district = "+nofcel);
    }
}
  interface cell
{
public void mycell();
}
 class testint extends province implements cell
{
public void mycell()
{
    String cel="MATABA";
    int nofv=5;
    String myvil="rusizi";
    System.out.println("your cell is: "+cel+"thenumber of village = "+nofv+"your village= "+myvil);

}
public static void main(String ar[])
{
testint c=new testint();
district d=new district();
sector s=new sector();
c.myprov();
d.mydist();
s.myc();
 c.mycell();

}
}
