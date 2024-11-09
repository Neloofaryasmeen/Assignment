 import java.util.Scanner;
 
 public class abdtNum {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isAbundant(num)) {
            System.out.println(num + " is an Abundant number.");
        } else {
            System.out.println(num + " is not an Abundant number.");
        }
        
        sc.close();
    }

    public static boolean isAbundant(int num) {
        int sumOfDivisors = 0;
        
       
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        
        return sumOfDivisors > num;
    }
}


