package AInheritance;
public class A2 
{ 
public A2()
{
System.out.println("constructor of A2");
}
}

class B2 extends A2 
{ 
public B2()
{
System.out.println("constructor of B2");
}
}

class Test2
{
public static void main(String[] args) 
{
B2 a=new B2(); //O/P gives both constructor due to super keyword
System.out.println(" ");
A2 a1=new B2();  //O/P gives both constructor due to super keyword
}}

