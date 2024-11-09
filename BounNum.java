
public class BounNum {

    // Function to check if a number is bouncy
    public static boolean isBouncy(int num) {
        boolean increasing = false;
        boolean decreasing = false;

        int lastDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int currentDigit = num % 10;

            if (currentDigit < lastDigit) {
                increasing = true;
            } else if (currentDigit > lastDigit) {
                decreasing = true;
            }

            // If both increasing and decreasing patterns are found, it's bouncy
            if (increasing && decreasing) {
                return true;
            }

            lastDigit = currentDigit;
            num /= 10;
        }

        return false; // Number is not bouncy if only increasing or only decreasing
    }

    public static void main(String[] args) {
        int[] testNumbers = {132, 253, 123, 321, 555};

        for (int number : testNumbers) {
            System.out.println("Is " + number + " a bouncy number? " + isBouncy(number));
        }
    }
}
