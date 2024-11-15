import java.util.*;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.*;

public class UserInput{
public static void main(String []args)throws IOException{
/*
//InputStreamReader in=new InputStreamReader(System.in);
try{
//BufferedReader rd=new BufferedReader(in) ;
BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first number:");
float val1=Float.parseFloat(rd.readLine());
System.out.println("Enter 2nd number:");
float val2=Float.parseFloat(rd.readLine());
float result=val1+val2;
System.out.println("sum of two enterd numbers:"+result);
}catch(NumberFormatException e){
System.out.println("Invalid input..Please enter an interger value only ");
}*/
try{
DataInputStream rd=new DataInputStream(System.in);
System.out.println("Enter first number:");
float val1=rd.readFloat();
System.out.println("Enter 2nd number:");
float val2=rd.readFloat();
float result=val1+val2;
System.out.println("sum of two enterd numbers:"+result);
}catch(NumberFormatException e){
System.out.println("Invalid input..Please enter an interger value only ");
}
}
}