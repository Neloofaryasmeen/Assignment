import java.util.Scanner;
  
public class magNum {
 
   public static int sumOfDigits(int num) {
       int sum = 0;
       while (num > 0) {
           sum += num % 10;
           num /= 10;
       }
       return sum;
   }

   public static boolean isMNum(int number) {
       int sum = sumOfDigits(number);
       return number % sum == 0;
   }

   public static int repeatedDigitSum(int num) {
       while (num >= 10) {
           num = sumOfDigits(num);
       }
       return num;
   }

   public static boolean isMagNumber(int num) {
       if (isMNum(num)) {
           int sum = sumOfDigits(num);
           int singleDigitSum = repeatedDigitSum(sum);
           return singleDigitSum == 1;
       }
       return false;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = sc.nextInt();
       sc.close();

       if (isMagNumber(num)) {
           System.out.println(num + " is a Magic Number.");
       }
       else {
           System.out.println(num + " is not a Magic Number.");
       }
   }
}



    



