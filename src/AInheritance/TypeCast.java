package AInheritance;
public class TypeCast {
//Types of Type Casting
//There are two types of type casting:
//Widening Type Casting
//Narrowing Type Casting 
//Widening Type Casting =Converting a lower data type into a higher one is called widening type casting. It is also known as implicit conversion or casting down. 	
//It is done automatically. It is safe because there is no chance to lose data. Both data types must be compatible with each other.The target type must be larger than the source type.
//byte -> short -> char -> int -> long -> float -> double  
//for implicit conversion type casting not requied manually.automatically done
}

class WideningTypeCastingExample  
{  
public static void main(String[] args)  
{  
int x = 7;  
//automatically converts the integer type into long type  
long y = x;  
//automatically converts the long type into float type  
float z = y;  
System.out.println("Before conversion, int value "+x);  //o/p Before conversion, int value 7
System.out.println("After conversion, long value "+y);  //After conversion, long value 7
}  
}  
//Narrowing Type Casting
//Converting a higher data type into a lower one is called narrowing type casting. It is also known as explicit conversion or casting up. It is done manually by the programmer. 
//If we do not perform casting then the compiler reports a compile-time error.
//double -> float -> long -> int -> char -> short -> byte  
class NarrowingTypeCastingExample  
{  
public static void main(String args[])  
{  
double d = 166.66;  
//converting double data type into long data type  
long l = (long)d;  //small datatype =(small datatype)big ref ....called explicit type casting
//converting long data type into int data type  
int i = (int)l;  
System.out.println("Before conversion: "+d); //o/p:Before conversion: 166.66
//fractional part lost  
System.out.println("After conversion into long type: "+l); //o/p:After conversion into long type: 166 
//fractional part lost  
System.out.println("After conversion into int type: "+i);//o/p:After conversion into int type: 166  
}  
}  

class char1implicit{//The char datatype can be promoted to int,long,float or double and so on.
void m1()
{System.out.println("o/p of m1");
char c='a';
int i=c;
long l=c;
float f=c;
double d=c;
System.out.println(c); //o/p:a
System.out.println(i); //o/p:97
System.out.println(l); //o/p:97
System.out.println(f); //o/p:97.0
System.out.println(d); //o/p:97.0
}
void m2() //we are try to convert all datetype into char explicitly
{System.out.println("o/p of m2");
int i=23;
long l=23;
float f=23.34f;
double d=123.56;
char ci=(char)i;
char cl=(char)l;
char cf=(char)f;
char cd=(char)d;
System.out.println(ci); //o/p:
System.out.println(l); //o/p:23
System.out.println(cf); //o/p:
System.out.println(cd); //o/p:{
}
public static void main(String[] args) {
char1implicit x=new char1implicit();
x.m1();
x.m2();	
}}





