import java.util.*;
public class FactIter{
public static void main(String []args){
long fact=1;
Scanner sc=new Scanner(System.in);
try{
System.out.println("PLease enter a number");
int n=sc.nextInt();
if(n<=0){
System.out.println("please enter a positive integer ");
}
else{
for(int i=2;i<=n;i++){
fact=fact*i;
}
System.out.println("factorial of number "+ n +"is "+fact);
}

}
catch(InputMismatchException e){
System.out.println("Invalid input,please enter a valid number");
}
}}