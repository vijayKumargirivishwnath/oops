package AInheritance;
public class A {
int x;
int z=500;
public void m1()
{
System.out.println("m1 of class A");
}
}

class B
{
public void m2(){
System.out.println("m2 of class B");
A a=new A();
a.m1();
System.out.println(a.x);
}
}

class C extends A
{
int y=10;
int z=1000;
public void m3()
{	
System.out.println("...inheritance concept...");
System.out.println("m3 of class C");
System.out.println(x); //due to inheritance no need to create obj of class A,bcz inheritance definition.
m1();
}
}

class Test
{
public static void main(String[] args) {
String s=args[0];  //write value in argument 
int a=Integer.parseInt(args[1]); //write value in argument (we write kanchan 11)
System.out.println(s);
System.out.println(a);
B b=new B();
b.m2();
A c=new C(); 
c.m1(); //method 
System.out.println(c.x);
System.out.println(c.z); //if same variable present in parent and child class.then we get value of parent variable
//ie variable overriding not possible in java.
//we can't call variable of class c   ie  System.out.println(c.y);  .....y not possible
//we can't call m3. m3 call by only creating obj of class C ie C c1=new C();
}}