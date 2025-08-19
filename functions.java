public class functions {

    // Hello World method
    public static void helloWorld() {
        System.out.println("Hello World");
    }

    // Sum method (do numbers ka sum nikalne ke liye)
    public static void sum(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + result);
    }

    public static void main(String[] args) {
        // Method call
        helloWorld(); // Hello World print karega
        sum(10, 20); // 10 + 20 = 30 print karega
    }
}
