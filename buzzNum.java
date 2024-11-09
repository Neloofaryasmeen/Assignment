
    import java.util.Scanner;

public class buzzNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isBuzzNum(num)) {
            System.out.println(num + " is a Buzz number.");
        } 
        else {
            System.out.println(num + " is not a Buzz number.");
        }
        
        sc.close();
    }

    public static boolean isBuzzNum(int num) {
       
        return (num % 7 == 0) || (num% 10 == 7);
    }
}


