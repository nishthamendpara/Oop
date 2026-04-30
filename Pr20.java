public class Pr20 {
    public static void main(String[] args) {

        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two arguments");
        } 
        catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } 
        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
//output
//java Pr20 10 2
//Result: 5
//
