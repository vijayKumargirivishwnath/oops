package Bpolymorphism;
public class X {
public static void sleep()
{
System.out.println("sleep parent");
}}
class Child1 extends X
{
public static void sleep()
{
System.out.println("sleep child");
}}
class Test3{
public static void main(String[] args) 
{	
X sm1=new X();  //method hidding due to static method
sm1.sleep(); //sleep parent
X smc=new Child1(); //method hidding due to static method
sm1.sleep(); //sleep parent
Child1 c=new Child1();
c.sleep(); //sleep child
}}

