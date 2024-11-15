import java.util.*;
public class arraySort{
public static void main(String []args){
int []arr={5,2,10,6,8,9,3,4};
System.out.println("array elements before sort");
System.out.println(Arrays.toString(arr));

for(int i=0;i<arr.length-1;i++){

for(int j=0;j<arr.length-i-1;j++)
{
     if(arr[j+1]<arr[j]){
     int temp=arr[j];
     arr[j]=arr[j+1];
     arr[j+1]=temp; 
     }
}
}
System.out.println("array elements after sort");

/*for(int i=0;i<arr.length-1;i++){
System.out.println(arr[i]);}*/
System.out.println(Arrays.toString(arr));
}
}