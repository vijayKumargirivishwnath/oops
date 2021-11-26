package Bpolymorphism;

public class A 
{
void m1(int a,String b)
{
System.out.println("metod 1overloaded");
}
void m1(int b,int c)
{
System.out.println("metod 2overloaded");
}
public static void main(String[] args)
{
A a=new A();
a.m1(12, 34);
a.m1(34, "vijay");
}}
