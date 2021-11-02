//Remove duplicates from array

import java.util.*;
 public class day2{
     public static void main(String []args){
         int i , j=0 ,p=0;
         int a[] = {1 , 1 ,2 ,2,2 ,2 , 3 , 3 ,3};
         int dup[] = new int[10];
         
         for(i=0 ; i<=a.length  ; i++){
             if(a[i] != a[i+1]){
                 a[j] = a[i];
                 j++;
                 p++;
               }
         }
         System.out.println("After removed");
         for(i=0 ; i<p ; i++){
             System.out.println(a[i]);
         }
 }
 }