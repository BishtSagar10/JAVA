import java.util.*;
class employee{
String name;
String address;
double age;
Scanner c =new Scanner(System.in);
public void getdata(){
System.out.println("Enter the name:");
name=c.nextLine();
System.out.println("Enter the address:");
address=c.nextLine();
System.out.println("Enter the age:");
age=c.nextInt();
}
public void showdata(){
System.out.println("Name of the employee is "+name);
System.out.println("Address of the employee is "+address);
System.out.println("Age of the employee is "+age);
}
}
class emp{
public static void main(String args[]){
employee e=new employee();
e.getdata();
e.showdata();
}
}