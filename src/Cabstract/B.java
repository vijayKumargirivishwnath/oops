package Cabstract;

public abstract class B {
public void m3(){System.out.println("m3 method");}
public void m4(){System.out.println("m4 method");}}

class C extends B{
public void m5(){m3();m4();System.out.println("m5 method");}}

class Test{
public static void main(String[] args) {
B b=new C(); b.m3(); b.m4();
System.out.println("creating object of child class");
C c=new C(); c.m3(); c.m4(); c.m5();}	}