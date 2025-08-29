public class BinaryToDecimal {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }

        System.out.println("Decimal equivalent: " + decNum);
    }
}
