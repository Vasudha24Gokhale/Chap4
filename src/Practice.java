import java.util.Scanner;

public class Practice {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int greater=0;
        int[] n = {2,4,9,1,4,5,6};
        for(int i = 0; i < n.length - 1; i++){
            if(n[i] > n[i+1]){
                int temp = n[i];
                n[i] = n[i+1];
                n[i+1] = temp;
            }
        }
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + "   ");
        }
        sc.close();  // Close the scanner
    }
}
