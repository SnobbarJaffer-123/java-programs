import java.util.*;
public class ArrInc{
public static void main(String []args){
int arr[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("enter array elements");
for(int i=0;i<=9;i++){
int arr[i]=sc.nextInt();
arr[i]=arr[i] +1;
}
System.out.println("array after increment of every element by one ");
for(int i=0;i<=9;i++){
System.out.println("value at index "+ i +":"+ arr[i]);
}
}}