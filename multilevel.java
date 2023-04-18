import java.util.*;
class parent{
public void show(){
System.out.println("Parent class");
}
}
class derived1 extends parent{
public void shown(){
System.out.println("Derived 1 class");
}
}
class derived2 extends derived1{
public void showed(){
System.out.println("Derived 2 class");
}
}
public class multilevel{
public static void main(String args[]){
derived2 d2= new derived2();
d2.show();
d2.shown();
d2.showed();
}
}
