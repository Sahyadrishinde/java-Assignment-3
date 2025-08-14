//Heirarchical inheritance
class  Employee
{
int salary=20000;
void pf()
{
System.out.println("PF facility");
}
}
class Programmer extends Employee
{
int bonus=10000;
void hi()
{
System.out.println("Health insurance");
}
}
class Tester extends Employee
{
int bonus=5000;
void ti()
{
System.out.println("Term insurance");
}
}
public class Hierarchical
{
public static void main(String args[])
{
Programmer p=new Programmer();
Tester t=new Tester();
int psalary=p.salary+p.bonus;
int tsalary=t.salary+t.bonus;
System.out.println("Gross salary of programmer is:"+psalary);
System.out.println("Gross salary of programmer is:"+tsalary);
p.pf();
p.hi();
t.pf();
t.ti();
}
}



