package Cabstract;
public abstract class A1 {
public void m1(){System.out.println("m1 method");}abstract void m2();abstract void m3();}

abstract class B1 extends A1{public void m2(){System.out.println("m2 method");}} //implements

class C1 extends B1{public void m3(){System.out.println("m3 method");}} ////implements

class Test2{public static void main(String[] args) { 
A1 a=new C1(); a.m1(); a.m2(); a.m3();
B1 b=new C1(); b.m1(); b.m2(); b.m3();
C1 c=new C1(); c.m1(); c.m2(); c.m3();
}}