  import java.util.Scanner;
  
  public class armsNum {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isArms(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        
        sc.close();
    }

    public static boolean isArms(int num) {
        int originalNumber = num;
        int sum = 0;
        int digits = Integer.toString(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == originalNumber;
    }
}


