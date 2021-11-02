// program to remove given number in the array
public class day3{
    public static void main(String []args){
        int i , j=0 , p=0;
        int a[] = {1,2,3,3,4,5};
        for(i=0 ; i<a.length ; i++){
            System.out.println(a[i]);
            if(a[i] != 3){
                a[j] = a[i];
                j++;
                p++;
            }
        }
        System.out.println(p);
        System.out.println("removed element");
        for(i=0 ; i<p ; i++){
            System.out.println(a[i]);
        }
    }
}