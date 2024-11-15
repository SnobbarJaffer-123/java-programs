import java.util.*;
public class StringToFloat{
public static void main(String []args){
Scanner sc=new Scanner(System.in);
try{
System.out.println("enter a float value represented as a string");
String st=sc.next();
//System.out.println(typeOf());
float numF=Float.parseFloat(st);
System.out.println("converted String to a float:"+numF);
}
catch(NumberFormatException e){
System.out.println("invalid input ..please enter a valid floating no.");
}
}}

