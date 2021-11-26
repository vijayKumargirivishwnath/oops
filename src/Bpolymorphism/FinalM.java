package Bpolymorphism;

public class FinalM { final void m1(){System.out.println("final m1 of parent");}}

class child extends FinalM { void m2(){ m1();System.out.println("final m1 of child");}}

class FTest{
public static void main(String[] args) {
FinalM fm=new child();
fm.m1();
child c=new child();
c.m1();
c.m2();
}}
//final method can't override.but inherited.