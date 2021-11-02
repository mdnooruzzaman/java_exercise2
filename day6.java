//program to palindrom

import java.util.*;

class day6{
    public static void main(String []args){
        int num = 0, x = num , rem , rev=0 ;
        while(num != 0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println(rev);
        if(rev == x && rev > 0){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}