import java.util.*;
class factorial{
public static void main(String[] args){
int i,num;
int fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number whose factorial to be found:");
num=sc.nextInt();
for(i=1;i<=num;i++){
fact=i*fact;
}
System.out.println("FACTORIAL OF "+num +""+"IS="+fact);
}
}