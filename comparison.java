import java.util.*;
class comparison
{
public static void main(String args[])
{
int num1,num2,num3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number1:");
num1=sc.nextInt();
System.out.println("Enter the number2:");
num2=sc.nextInt();
System.out.println("Enter the number3:");
num3=sc.nextInt();
if (num1>num2 && num1>num3)
System.out.println("NUMBER 1 is greatest");
else if (num2>num1 && num2>num3)
System.out.println("NUMBER 2 is greatest");
else if(num3>num1 && num3>num2)
System.out.println("NUMBER 1 is greatest");

}
}