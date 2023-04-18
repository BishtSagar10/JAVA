import java.util.Arrays;
class array{
public static void main(String args[]){
int a[]={3,4,6,9,12};
for(int i=0;i<6;i++)
{
System.out.println("Element at"+ i + ":" +a[i]);
}
System.out.println(Arrays.toString(a));
Arrays.sort(a);
System.out.println(Arrays.toString(a));
}
}