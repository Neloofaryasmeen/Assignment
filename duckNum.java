 import java.util.Scanner;
 
 public class duckNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        if (isDuckNum(num)) {
            System.out.println(num + " is a Duck number.");
        } else {
            System.out.println(num + " is not a Duck number.");
        }
        
        sc.close();
    }

    public static boolean isDuckNum(int num) {
        String numStr = Integer.toString(num);
        
        // Check if the number contains '0' and does not start with '0'
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }
}


