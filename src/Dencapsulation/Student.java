package Dencapsulation;
public class Student {
//private data member  
private String name;  
//getter method for name  
public String getName(){  
return name;  
}  
//setter method for name  
public void setName(String name){  
this.name=name; 
}
@Override
public String toString() {
return "Student [name=" + name + "]";
} 
}  
class Test{  
public static void main(String[] args){  
//creating instance of the encapsulated class  
Student s=new Student();  
//setting value in the name member  
s.setName("vijay");  
//getting value of the name member  
System.out.println(s.getName()); 
}
}
//if get method is present then no need to write tostring method for getting value
//(if get and tostring method not present we get o/p in hashcode)