package Bpolymorphism;
public class StatcVariable 
{
int id;
String name;
static  String college;   //static variable can not write in main method or in any method directly.
static String dep="mechanical";
//static variable not use in constructor parameter by using sourse but munally u can add in constructor parameter.
public StatcVariable(int id, String name) {
super();
this.id = id;
this.name = name;
}

@Override
public String toString() {
	return "StatcVariable [id=" + id + ", name=" + name + "]";
}
public static void main(String[] args) {
StatcVariable.college="bncoe";
System.out.println(StatcVariable.college); //for static variable no need to create object of class.
System.out.println(StatcVariable.dep);
StatcVariable s1=new StatcVariable(101,"vijay"); 
StatcVariable s2=new StatcVariable(102, "ranjit"); 
System.out.println(s1);
System.out.println(s2);
}
}

