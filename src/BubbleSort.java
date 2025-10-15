public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) {
            boolean swapped = false;
            for (inner = 0; inner < outer; inner++) {
                if (a[inner] > a[inner + 1]) {
                    // swap
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // already sorted
        }
    }

    // Time complexity is O(n^2)
    // Space complexity is O(1)
}
