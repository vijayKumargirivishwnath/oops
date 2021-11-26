package AInheritance;
public class A4 {
//Hierarchical inheritance
int x=10;
int y=20;
public void m1()
{
System.out.println("m1 of A4");
}
public void m2()
{
System.out.println("m2 of A4");
}
}

class B4 extends A4
{
int y=30; 
int z=40;
public void m3()
{
System.out.println("m3 of B4");
}
public void m4()
{
System.out.println("m4 of B4");
}
}

class C4 extends A4
{
int x=50;
int z=60;
public void m5()
{
System.out.println("m5 of c4");
}
public void m6()
{
System.out.println("m6 of C4");
}
}

class Test4 
{
public static void main(String[] args) {
A4 a=new A4();
a.m1();
a.m2();
A4 a1=new B4();
a1.m1();
a1.m2();
System.out.println(a1.x);
System.out.println(a1.y);
A4 a2=new C4();
a2.m1();
a2.m2();
//1.all method of parent class call at complier time
//2.at runtime duplicate method of child class as o/p(ie method overriding) including remaing method of parent class as final o/p
//3.extra method of child class(which is not present in parent class) not consider (not call)   
//variable of parent class only consider (child class che konteche variable ghet nahi).
//A w=null;  //null point exception,but complier time no problem. 
//System.out.println(w.x);
//w.m1();
//====================================================================================================  
//if we crate of object of child class then(ie reference of child class) then, we can call both child and parent class method.
System.out.println("..... by cretating child class.......");
B4 b=new B4();
b.m1();
b.m2();
b.m3();
b.m4();
System.out.println(b.x); 
System.out.println("value of child variable y(parent class also have y)="+b.y); // if same variable present then, child class variable value get (here variable overriding is possible)
System.out.println(b.z);
//all method (parent and child ) can access by creating object of child class.for same method, child class method call called 
//method overriding.

///notes--if we create child class object like  (B b =new B();) then..
//1)method sathi---to swatachya purnaa ghenar mehod.ani urlelya parent chya purnn ghenar(repeat ghenar nahi)
//2)varaiable sathi---(same aahe as above)swatachya variable purna ghenar & parent chya urlelya variable ghenar(repeated ghenar nahi)   
}}