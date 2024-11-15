
import java.util.*;
public class monthToSeason{
public static void main(String [] args){

/*Scanner sc=new Scanner(System.in);
System.out.println("enter any month number to get the corresopnding season");
int month=sc.nextInt();
System.out.println(month);
if( month==12 ||month==1||month==2)
{
System.out.println("its winter season");
}
else if(month>=3 && month<=5){
System.out.println("its spring season");
}
else if(month>=6 && month<=8){
System.out.println("its summer");
}
else if(month>=9 && month<=11)
{
System.out.println("its autumn season");
}
else{
System.out.println("please enter the right one");}
}}*/

Scanner sc=new Scanner(System.in);
System.out.println("enter any month number to get the corresopnding season");
try{
int month=sc.nextInt();
switch(month){
case 12:
case 1:
case 2:
System.out.println("its winter season");
break;

case 3:
case 4:
case 5:
System.out.println("its spring season");
break;

case 6:
case 7:
case 8:
System.out.println("its summer season");
break;

case 9:
case 10:
case 11:
System.out.println("its autumn season");
break;

default:
System.out.println("invalid input");

}
}
catch(InputMismatchException e){
System.out.println("please enter the numbers only between 1-12");
}
}}