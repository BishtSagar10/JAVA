import java.util.*;
class student{
int rollno;
String name;
float fee;
student(int rollno,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display(){
System.out.println(rollno+" "+name+" "+" "+fee);
}
}
class thispointer{
public static void main(String args[]){
student s1=new student(111,"sagar",19000f);
student s2=new student(121,"aniket",28000f);
s1.display();
s2.display();
}
}
