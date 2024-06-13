public class Pointer {
    public static void main(String args[]) {
        int arr[] = {3, 4, 1,5, 5, 6,9};
        int j = arr.length - 1;
        System.out.println(arr.length/2);
        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--; // Decrement j after each swap
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
