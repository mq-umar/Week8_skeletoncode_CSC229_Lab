public class Problem01 {

    public static long getSumOfPrimes(int n) {
        long sum = 0;
        for (int x = 2; x <= n; x++) {
            if (isPrime(x)) {
                sum += x;
            }
        }
        return sum;
    }

    private static boolean isPrime(int x) {
        if (x < 2) return false;
        if (x % 2 == 0 && x != 2) return false;
        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    // Time complexity is O(n * sqrt(n))
    // Space complexity is O(1)
}
