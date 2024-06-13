import java.util.*;
public class Swap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={6,8,9,3,2};
        System.out.println("before swaping");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
       int temp=a[0];
       a[0]=a[(a.length)-1];
        a[(a.length)-1]=temp;
        System.out.println("before swaping");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

}
