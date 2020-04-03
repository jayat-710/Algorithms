import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
     Scanner sc = new Scanner(System.in);
     int t = sc.nextInt();
     while(t-->0){
       int n =sc.nextInt();
       int arr[]= new int[n];
       for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
       }
       Arrays.sort(arr);
       
       majorityVotes(arr,n);
    
  }/*/////// we know that , in  array the maximum element found will be greater than 
                 n/2 , so first what i have done is , i> sorted the array. ii>than search for the arr[n/2]
                 , in every matching (arr[n/2]==arr[i]); count++(increment the count); iii> if the 
                 increament is greater than n/2 ; than print arr[n/2]; else print -1;*/
  }
  
    static void majorityVotes(int arr[], int n)  
{  
   int count=0;
   for(int i=0;i<n;i++){
       if(arr[n/2]==arr[i]){
           count++;
       }
   }
   if(count>n/2){
       System.out.println(arr[n/2]);
   }
   else
    System.out.println(-1);
}
  
}
