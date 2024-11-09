import java.util.Scanner;
public class harshNum {
    
       public static int sumOfDigits(int number) {
           int sum = 0;
           while (number > 0) {
               sum += number % 10;
               number /= 10;
           }
           return sum;
       }
   
     
       public static boolean isnivNumber(int number) {
           int sum = sumOfDigits(number);
           return number % sum == 0;
       }
   
       public static void main(String[] args) {
           Scanner sc= new Scanner(System.in);
           System.out.print("Enter a number: ");
           int number = sc.nextInt();
           sc.close();
   
           if (isnivNumber(number)) {
               System.out.println(number + " is a Harshad Number.");
           } else {
               System.out.println(number + " is not a Harshad Number.");
           }
       }
   }
   
   

