import java.util.Scanner;

class Point {
    int x, y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int a, int b) {
        x = a;
        y = b;
    }

    // Copy constructor
    Point(Point p) {
        x = p.x;
        y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class Pr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();

        // Parameterized constructor
        System.out.print("\nEnter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Point p2 = new Point(x, y);

        System.out.println("Parameterized Constructor:");
        p2.display();

        // Copy constructor
        Point p3 = new Point(p2);
        System.out.println("Copy Constructor:");
        p3.display();
    }
}
