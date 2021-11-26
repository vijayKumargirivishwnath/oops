package Bpolymorphism;
public class ExceptionOverridnig { void m1() throws ClassNotFoundException{}}
 class Subclass extends ExceptionOverridnig{
void m1() throws ClassNotFoundException
{
Class.forName("vijay");
 }	 
 }
 //in  subclass check exception is present then we must throws check exception to parent class overriding method.
 //ie Rule 1: If the superclass method does not declare an exception, 
 //subclass overridden method cannot declare the checked exception. then error comes at compier time.
  
class subclass1 extends ExceptionOverridnig{
	 void m1() throws ArithmeticException
	 {
	 int a=10/0;
  }
 }
class TestException{
public static void main(String[] args) throws ClassNotFoundException {
//Subclass s=new Subclass();
//s.m1();
subclass1 s1=new subclass1();
s1.m1();
 }}
//if check exception present if child class method(overriding), then must throws to parent class method
//but for uncheck exception no need to throws by parent method.

//Rule 1: If the superclass method declares an exception, subclass overridden method can declare 
//the same subclass exception or no exception but cannot declare parent exception.