public class BinarySearch {

    public static int runBinarySearch(int[] sortedArray, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args)
        int[] arr = {1, 3, 5, 7, 9, 12, 15};
        int k1 = 9;
        int k2 = 10;
        System.out.println("Finding 9, index: " +
                runBinarySearch(arr, k1, 0, arr.length - 1));
        System.out.println("Finding 10, index: " +
                runBinarySearch(arr, k2, 0, arr.length - 1));
    }

    // Time complexity is O(log n)
    // Space complexity is O(1)
}
