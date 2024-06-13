public class KthReverse {
    public static void main(String args[]) {
            int arr[] = {1, 2, 3, 4, 5};
            int k = 2;
            int n = arr.length;
            k = k % n; // Ensure k is within the bounds of the array length
            int[] ans = new int[n];
            int j=0;

            // Copy the last k elements to the beginning of the new array
            for (int i = n-k; i < n; i++) {
                ans[j++] = arr[i];
            }

            // Copy the first n-k elements to the end of the new array
            for (int i = 0; i < n-k; i++) {
                ans[j++] = arr[i];
            }
//

            // Print the rotated array
            for (int i=0;i<ans.length;i++) {
                System.out.print(ans[i] + " ");
            }
        }
    }

