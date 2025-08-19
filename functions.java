import java.util.Scanner;

public class functions {

    public static void helloWorld() {
        System.out.println("Hello World");
    }

    public static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = a + b;
        System.out.println("Sum: " + result);

        sc.close();
    }

    public static void main(String[] args) {
        helloWorld();
        sum();
    }
}
