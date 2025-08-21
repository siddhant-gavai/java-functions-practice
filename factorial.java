public class factorial {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Iterative method to calculate factorial
    public static int factorial2(int n) {
        int f = 1;
        for (int i = 2; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " = " + result);
        int n = 10;
        int result2 = factorial2(n);
        System.out.println("Factorial of " + n + " = " + result2);
    }
}
