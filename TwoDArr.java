public class TwoDArr{
public static void main(String []args){
int arr[][]={
{1,3,5,9},{4,5,7,8},{2},{8,4},{10,12,19,18}};

for(int[] row:arr){
for(int val:row){
System.out.print(" "+val+" ");
}
System.out.println();
}


/*for(int i=0;i<arr.length;i++){
for(int j=0;j<arr[i].length;j++){
System.out.println(arr[i][j]+" ");
}
System.out.println();
}*/
}
}
