import java.util.*;
class fibonacci{
    public static void main(String args[]){
    int a=0,b=1,c;
    int num,i;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter number of terms in fibonacci series=");
    num=sc.nextInt();
    System.out.println("Fibonacci series of "+num+" "+"terms");
    System.out.println(a);
    System.out.println(a);
    for(i=2;i<num;i++){
        c=a+b;
        System.out.println(""+c);
        a=b;
        b=c;
    }

    
    }
}