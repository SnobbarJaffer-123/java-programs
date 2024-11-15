import java.util.*;
public class factorial{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any integer number to get its factorial");
try{
int num=sc.nextInt();
//long result=factorial(num);
//System.out.println("factorial of a number :"+result);

if(num>=0)
System.out.println(factorial(num));
else
System.out.println("there is no factorial of -ive numvers");
}
catch(InputMismatchException e){
System.out.println("Invalid input..please enter positive integers only");
}
}
public static long factorial(int n){
if(n==0||n==1){
return 1;
}
else {
return n*factorial(n-1) ;
}

}}