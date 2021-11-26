package AInheritance;
public class X {void m1(){System.out.println("m1 of parent(x)");}}

class Y extends X  {void m2(){System.out.println("m2 of Child(Y)");}}
 
class Z extends X {void m3(){System.out.println("m3 of Child(Z)");}}

class Testxyz{public static void main(String[] args) {
X x=new X(); x.m1(); 
Y y=new Y(); y.m1(); y.m2();
Z z=new Z(); z.m1(); z.m3();
X xy=new Y(); xy.m1();
X xz=new Z(); xz.m1();  
}}