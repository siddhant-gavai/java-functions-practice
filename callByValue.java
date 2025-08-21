public class callByValue {
    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("a = " + x + ", b = " + y);

    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);

    }

}
