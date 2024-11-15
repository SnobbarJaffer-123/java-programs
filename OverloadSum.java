import java.util.*;
public class OverloadSum{
public void sum(int n1,int n2){
int sumInt=n1+n2;
System.out.println("sum of two integer numbers "+n1 +" and "+n2  +":"+sumInt);
}

public void sum(float n1,float n2){
float sumFloat=n1+n2;
System.out.println("sum of two floating point numbers "+n1 +" and "+n2  +":"+sumFloat);
}

public static void main(String []args){
OverloadSum obj=new OverloadSum();
Scanner sc=new Scanner(System.in);
try{
System.out.println("enter an integer element");
int nI1=sc.nextInt();
System.out.println("enter another integer element");
int nI2=sc.nextInt();
obj.sum(nI1,nI2);
}
catch(InputMismatchException e){
System.out.println("Invalid input..plz enter the integer values only");
}

System.out.println("enter a floating point number");
try{
float nF1=sc.nextFloat();
System.out.println("enter another floating point number");
float nF2=sc.nextFloat();
obj.sum(nF1,nF2);
}
catch(InputMismatchException e){
System.out.println("Invalid input..plz enter the floating point values only");
}
}
}