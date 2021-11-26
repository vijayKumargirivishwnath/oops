package Bpolymorphism;

public class StaticMethod {public static void m1(){System.out.println("m1 of parent");}}

class B extends StaticMethod {public static  void m1(){System.out.println("m1 of child");}}
	
class Test1{
public static void main(String[] args) {
System.out.println(".........for static method");
StaticMethod sm=new B();
sm.m1(); //method hidding(child chi) possible if method is static
B b=new B();
b.m1();
System.out.println("....for non static method(method overriding possible in normal methos");
StaticMethod1 sm1=new B1();
sm1.m2();
B1 b1=new B1();
b1.m2();
}}
//static method will not be override.
//but static method will be inherited.
class StaticMethod1 {public  void m2(){System.out.println("m1 of parent");}}
class B1 extends StaticMethod1 {public   void m2(){System.out.println("m1 of child");}}
	