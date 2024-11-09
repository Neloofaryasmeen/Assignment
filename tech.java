public class tech {
    
      
        public static boolean isSplitSquare(int number) {
            String numStr = String.valueOf(number);
            
           
            if (numStr.length() % 2 != 0) {
                return false;
            }
            
            int mid = numStr.length() / 2;
            
          
            int part1 = Integer.parseInt(numStr.substring(0, mid));
            int part2 = Integer.parseInt(numStr.substring(mid));
            
           
            int sum = part1 + part2;
            return sum * sum == number;
        }
    
        public static void main(String[] args) {
           
            System.out.println("Numbers with split-square property:");
            for (int number = 1000; number < 10000; number++) { 
                if (isSplitSquare(number)) {
                    System.out.println(number);
                }
            }
        }
    }
    

