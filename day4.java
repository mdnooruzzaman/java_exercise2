//program to  maximum diffrence between two adjacent element


import java.util.*;

public class day4{
    public static void main(String []args){
        int i , j ,temp=0 , temp1=0;
        int a[] = {7 , 3 ,2,6,5};
        for(i=0 ; i<a.length-1 ; i++){
            temp1 = a[i+1] - a[i];
            for(j=1 ; j<a.length-1 ; j++){
                temp1 = a[j] - a[i];
                if(temp1 > temp){
                    temp = temp1;
                    
                }
            }
        }
    System.out.println(temp);
    }
}