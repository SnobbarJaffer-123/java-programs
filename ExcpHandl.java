import java.util.*;

public class ExcpHandl{

public static int div(int n1,int n2)throws ArithmeticException{
if(n2==1){
throw new IllegalArgumentException("please enter some another integer valve ohter then 1...denominator");
}
return n1/n2;
}
public static void main(String []args){

Scanner sc=new Scanner(System.in);

try{
System.out.println("enter an Integer value ..numerator");
int num=sc.nextInt();
System.out.println("enter an Integer value ..denominator");
int deno=sc.nextInt();



int result=div(num,deno);
System.out.println("RESULT:"+result);
}

catch(InputMismatchException e){
System.out.println("invalid type..please enter interger values only");
}
catch(ArithmeticException e){
System.out.println("invalid denominator...please enter non zero element");
}
catch(Exception e)
{
System.out.println("Exception:"+e.getMessage());
}
}
}
