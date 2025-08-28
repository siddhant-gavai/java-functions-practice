public class PrimeInRange {

    // Helper method: ek number prime hai ya nahi
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false; // 0 aur 1 prime nahi hote
        if (n == 2 || n == 3)
            return true; // 2 aur 3 prime hai
        if (n % 2 == 0)
            return false; // even numbers prime nahi hote (except 2)

        // sirf sqrt(n) tak check
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // factor mil gaya → prime nahi
            }
        }
        return true;
    }

    // Print all primes in range 1..n
    public static void printPrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        int n = 100; // yaha range set karo
        System.out.println("Prime numbers from 1 to " + n + ":");
        printPrimesInRange(n);
    }
}
