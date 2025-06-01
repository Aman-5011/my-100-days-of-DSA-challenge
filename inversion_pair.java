public class inversion_pair{
// Global counter to track number of inversions
    static int count;

    // Recursive function to perform merge sort and count inversions
    public static void mergesort(int[] arr) {
        int n = arr.length;

        // Base case: an array with one element is already sorted
        if (n == 1) return;

        // Split array into two halves: a and b
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Copy first half into a[]
        for (int i = 0; i < a.length; i++) a[i] = arr[i];

        // Copy second half into b[]
        for (int i = 0; i < b.length; i++) b[i] = arr[i + n / 2];

        // Recursively sort both halves
        mergesort(a);
        mergesort(b);

        // Merge sorted halves and count cross-inversions
        merge(a, b, arr);
    }

    // Merge two sorted arrays a[] and b[] into c[], counting inversions
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // Traverse both arrays
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                // No inversion, copy from a[]
                c[k++] = a[i++];
            } else {
                // Inversion found: all remaining elements in a[i...] are greater than b[j]
                c[k++] = b[j++];
                count += a.length - i;  // Count these as inversions
            }
        }

        // Copy any remaining elements from a[]
        while (i < a.length) c[k++] = a[i++];

        // Copy any remaining elements from b[]
        while (j < b.length) c[k++] = b[j++];
    }

    // Main method to run the program
    public static void main(String[] args) {
        int[] arr = {8, 2, 5, 3, 1, 4};  // Input array

        // Perform merge sort and count inversions
        mergesort(arr);

        // Print total number of inversions
        System.out.println(count);  // Output should be 10
    }
}