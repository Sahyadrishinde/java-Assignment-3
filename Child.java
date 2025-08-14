//Inheritance
class Parent
{
String surname="Shinde";
int balance=10000000;
public void display()
{
System.out.println("Surname:"+surname+ " Balance:"+balance);
}
}
public class Child extends Parent
{
public static void main(String args[])
{
Child c=new Child();
c.display();
}
}
