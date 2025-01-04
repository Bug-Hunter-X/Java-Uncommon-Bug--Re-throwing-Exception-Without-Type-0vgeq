public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        try {
            x = x / 0; //ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            //Re-throwing the ArithmeticException explicitly 
            throw e; 
        } catch (Exception e){
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}