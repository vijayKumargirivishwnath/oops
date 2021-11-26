package AInheritance;
//multilevel inheritance
public class A3 {
int x=10;
int y=20;
public void m1()
{System.out.println("m1 of A3");
System.out.println(x);
System.out.println(y);
}
public void m2()
{System.out.println("m2 of A3");
System.out.println(x+y);	
}
}

class B3 extends A3
{
int z=30; // int x=100; int y=200;  //o/p we get x=100,y=200 due to super keyword(instated of 10 and 20)
public void m3()
{System.out.println("m3 of B3");
System.out.println(z);	
}      //public void m1(){} overriding 
} 

class C3 extends B3
{ 
int w=40; //int z=300; //o/p we get z=300; due to super keyword (instated of 30)
public void m4()
{System.out.println("m4 of C3");
System.out.println(w);
}   //public void m3(){} overriding
}

class Test3 extends C3
{
public static void main(String[] args) {
Test3 t=new Test3();
t.m1();
t.m2();
t.m3();
t.m4(); 
System.out.println(t.x);
System.out.println(t.y);
System.out.println(t.z);
System.out.println(t.w);
}}
