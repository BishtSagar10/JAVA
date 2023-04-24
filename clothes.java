import java.util.*;
class price{
int p_shirt=799;
int p_jeans=1599;
int p_coats=3499;
}
class shirt extends price{
int quantity_shirt=170;
}
class jeans extends price{
int quantity_jeans=85;
}
class coats extends price{
int quantity_coats=49;
}
public class clothes{
public static void main(String args[]){
shirt sh=new shirt();
jeans je=new jeans();
coats co=new coats();
System.out.println("Price of "+sh.quantity_shirt+" shirts is "+sh.p_shirt*sh.quantity_shirt);
System.out.println("Price of "+je.quantity_jeans+" jeans is "+je.p_jeans*je.quantity_jeans);
System.out.println("Price of "+co.quantity_coats+" coats is "+co.p_coats*co.quantity_coats);
}
}