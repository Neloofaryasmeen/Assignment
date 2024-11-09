 import java.util.Scanner;
 public class pronicNum {

    public static boolean isPNum(int number) {
        for (int i = 0; i <= Math.sqrt(number); i++) {
            if (i * (i + 1) == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if (isPNum(number)) {
            System.out.println(number + " is a Pronic Number.");
        } 
        else {
            System.out.println(number + " is not a Pronic Number.");
        }
    }
}


