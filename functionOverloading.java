public class functionOverloading {
    // Function to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Function to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        int sum1 = add(5, 10);
        int sum2 = add(5, 10, 15);
        System.out.println("Sum of two numbers: " + sum1);
        System.out.println("Sum of three numbers: " + sum2);
        double sum3 = add(5.5, 10.5);
        System.out.println("Sum of two double numbers: " + sum3);
    }
}
