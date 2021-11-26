package AInheritance;
public class A1 {
int x=10;public void m1(){System.out.println("m1 of A1");}}

class B1
{ 
A1 a1=new A1(); //use of object at instance level is Has-A relationship
public void m2()
{
System.out.println("m2 of B1"); 
a1.m1();
System.out.println(a1.x);
}
}

class Test1
{
public static void main(String[] args) {
B1 b1=new B1();  //use-A relationship
b1.m2();
}}
