import java.util.*;
public class rec
{
double length,breadth;
double area;
Scanner sc = new Scanner(System.in);
void input()
{
System.out.println("enter length");
length=sc.nextDouble();
System.out.println("enter breadth");
breadth=sc.nextDouble();
}
void calcarea()
{
area=length*breadth;
}
void output()
{
System.out.println("area of rectangle = "+area);
}
public static void main(String args[])
{
rec r = new rec();
r.input();
r.calcarea();
r.output();
}
}


