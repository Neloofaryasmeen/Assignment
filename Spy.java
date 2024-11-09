import java.util.Scanner;

public class Spy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isSpyNum(num)) {
            System.out.println(num + " is a Spy number.");
        } else {
            System.out.println(num + " is not a Spy number.");
        }
        
        sc.close();
    }

    public static boolean isSpyNum(int num) {
        int sum = 0;
        int product = 1;
        
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        
        return sum == product;
    }
}
