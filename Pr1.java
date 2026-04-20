import java.util.Scanner;

public class MeterToFeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in meters: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.printf("Distance in feet: %.2f\n", feet);
    }
  
//output
//Enter distance in meters: 5
//Distance in feet: 16.40
