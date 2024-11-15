import java.util.*;
public class sumInts{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter an integer number");
try{
int num1=sc.nextInt();
System.out.println("enter 2nd integer number");
int num2=sc.nextInt();
int sum=num1+num2;

System.out.println(num1 +"+" + num2+"="+sum);
}

catch(InputMismatchException e){
System.out.println("invalid input,please enter integer value");
}
}}