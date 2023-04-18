import java.util.*;
public class Rectangle{
double length,breadth;
double area;
Scanner sc=new Scanner(System.in);
void Input(){

System.out.println("Enter the Length:");
length=sc.nextDouble();

System.out.println("Enter the Breadth:");
breadth=sc.nextDouble();
}
void CalcArea(){
area=length*breadth;
}
void Output(){
System.out.println("Area of rectangle="+area);
}
public static void main(String args[])
{
Rectangle R=new Rectangle();
R.Input();
R.CalcArea();
R.Output();

}
}