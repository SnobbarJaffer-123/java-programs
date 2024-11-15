import java.util.*;
public class DisplayInt{
public static void main(String []args){

Scanner sc=new Scanner(System.in);
System.out.println("enter an interger element");
try{
int val=sc.nextInt();
System.out.println(val +" is a user entered integer value");
}

catch(InputMismatchException e){
System.out.println("Invalid type");
}
}
}
