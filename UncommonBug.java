public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = x / 0; //ArithmeticException
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
            // Re-throwing the exception without specifying the exception type
            throw e; 
        }
    }
}