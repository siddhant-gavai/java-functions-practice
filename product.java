public class product {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;

    }

    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        int result = multiply(a, b);
        System.out.println(a + " * " + b + " = " + result);
    }
}
