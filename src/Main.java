import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
      int a[]={1,2,3,4,5};
        int temp=0;
        int i=0;
        for(int j=a.length-1;j>=a.length/2;j--){

                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                 i++;
        }
      for(int j=0;j<a.length;j++){
          System.out.print(a[j]+" ");
      }



    }
}