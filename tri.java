import java.util.ArrayList;
import java.util.List;

public class tri {
    
   public static List<Integer> generateTribonacci(int limit) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0); 
        sequence.add(1);
        sequence.add(1); 

        while (true) {
            int nextTerm = sequence.get(sequence.size() - 1) 
                         + sequence.get(sequence.size() - 2) 
                         + sequence.get(sequence.size() - 3);

            if (nextTerm > limit) break;
            sequence.add(nextTerm);
        }

        return sequence;
    }

   
    public static boolean isTribonacci(int number, List<Integer> sequence) {
        return sequence.contains(number);
    }

    public static void main(String[] args) {
        int limit = 1000; 
        List<Integer> tribonacciSequence = generateTribonacci(limit);

    
        int[] testNumbers = {4, 13, 20, 24, 33}; 

        System.out.println("Checking if numbers are part of the Tribonacci sequence:");
        for (int number : testNumbers) {
            if (isTribonacci(number, tribonacciSequence)) {
                System.out.println(number + " is part of the Tribonacci sequence.");
            } else {
                System.out.println(number + " is NOT part of the Tribonacci sequence.");
            }
        }
    }
}


