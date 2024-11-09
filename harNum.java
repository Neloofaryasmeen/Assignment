 import java.util.Scanner;
 public class harNum {
   

  
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    public static int repeatedDigitSum(int number) {
        while (number >= 10) {
            number = sumOfDigits(number);
        }
        return number;
    }

    public static boolean isHarshadMagicNumber(int number) {
        if (isHarshadNumber(number)) {
            int sum = sumOfDigits(number);
            int singleDigitSum = repeatedDigitSum(sum);
            return singleDigitSum == 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (isHarshadMagicNumber(number)) {
            System.out.println(number + " is a Harshad Magic Number.");
        }
        else {
            System.out.println(number + " is not a Harshad Magic Number.");
        }
    }
}


