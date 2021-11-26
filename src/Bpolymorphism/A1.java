package Bpolymorphism;
//Narrowing for method overloading
public class A1 {
private static final Object Object = null;
public void m1(Object o)
{
System.out.println("m1 object");
}
public void m1(String s)
{
System.out.println("m1 string");
}
public void m1(A1 a)
{
	System.out.println("m1 A");
}
public static void main(String[] args) {
A1 a=new A1();
a.m1(args);
String s="vijay";
a.m1(s);
a.m1((A1)null);
a.m1((String)null);
a.m1((Object)null);
}}
