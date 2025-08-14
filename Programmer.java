class Employee
{
int salary=25000;
void show()
{
System.out.println("employee Class");
}
}
public class Programmer extends Employee
{
int bonus=10000;
void display()
{
System.out.println("Programmer class");
}
public static void main(String args[])
{
Programmer p=new Programmer();
int total=p.salary+p.bonus;
p.show();
p.display();
System.out.println("Gross salary of employee is: "+total);
}
}