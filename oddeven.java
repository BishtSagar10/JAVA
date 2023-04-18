import java.util.*;
class oddeven
{
public static void main(String args[])
{
int num1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number1:");
num1=sc.nextInt();
if (num1%2==0)
System.out.println(num1+" Number is even");
else
System.out.println(num1+" Number is odd");
sc.close();
}
}