//program to sum of even numbers and odd numbers in the array

import java.util.*;
public class day1{
    public static void main(String []args){
        int i,j , eve = 0 , od = 0;
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        for(i=0 ; i<a.length ; i++){
            if(a[i] % 2 == 0){
                eve = eve + a[i];
            }
        }
        System.out.println("sum of even numbers " + eve);
        for(i=0 ; i<a.length ; i++){
            if(a[i] % 2 != 0){
                od = od + a[i];
            }
        }
        System.out.println("sum of odd numbers " + od);
        
    }
}