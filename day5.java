//program to reverse the integer
import java.util.*;

public class day5{
    public static void main(String []args){
        int i , j , num=123, reminder ,div , temp=0 ,reverse=0;
        for(;num != 0;){
         reminder = num%10;
         reverse = reverse*10 + reminder;
         num = num/10;
        
        }
        System.out.println(reverse);
       
    }
}