 import java.util.Scanner;


 public class disnum {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int num = sc.nextInt();
         
         if (isDisarium(num)) {
             System.out.println(num + " is a Disarium number.");
         } else {
             System.out.println(num + " is not a Disarium number.");
         }
         
         sc.close();
     }
 
     public static boolean isDisarium(int num) {
         int sum = 0;
         int digits = Integer.toString(num).length();
         int temp = num;
         
         for (int i = digits; i > 0; i--) {
             int digit = temp % 10;
             sum += Math.pow(digit, i);
             temp /= 10;
         }
         
         return sum == num;
     }
 }
 

