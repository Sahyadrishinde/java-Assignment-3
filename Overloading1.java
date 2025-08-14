//polymorphism (static ,compile time)
public class Overloading1
{
public void add()
{
int a=10;
int b=20;
int c=a+b;
System.out.println("Addition is: "+c);
}
public int add(int a,int b)
{
return a+b;
}
public double add(double a,double b)
{
return a+b;
}
public static void main(String args[])
{
Overloading1 o=new Overloading1();
o.add();
int i=o.add(40,60);
System.out.println("Addition is: "+i);
double j=o.add(20.5,30.5);
System.out.println("Addition is: "+j);
}
}