package Search ;
import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target element
        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        // Perform linear search
        int index = linearSearch(arr, target);

        if(index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);
        }

        sc.close();
    }

    // Linear search function
    public static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i; // return index if found
            }
        }
        return -1; // return -1 if not found
    }
}
