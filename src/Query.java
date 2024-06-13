import java.util.*;

public class Query {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {4, 7, 9, 7, 5, 2};
        int q = 5;
        for (int i = 0; i < q; i++) {
            System.out.println("Enter a number to check its presence in the array:");
            int tell = sc.nextInt();
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (tell == arr[j]) {
                    count++;
                    break; // Exit the loop as soon as we find the number
                }
            }
            if (count > 0) {
                System.out.println("Present");
            } else {
                System.out.println("Not present");
            }
        }
    }
}
