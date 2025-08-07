//Inheritance
 class Animal
{
String color;
public void voice()
{
System.out.println("In animal voice");
}
}
public class Cat extends Animal
{
public void work()
{
System.out.println("In work of cat");
}
public static void main(String args[])
{
Cat c=new Cat();
c.work();
c.voice();
c.color="Black";
System.out.println("the color of cat is "+c.color);
}
}