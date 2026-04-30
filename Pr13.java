class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    void display() {
        System.out.println("Triangle Area: " + (0.5 * d1 * d2));
    }
}

class Rectangle extends Shape {
    void display() {
        System.out.println("Rectangle Area: " + (d1 * d2));
    }
}

public class Pr13 {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.getData(10, 5);
        t.display();

        Rectangle r = new Rectangle();
        r.getData(4, 6);
        r.display();
    }
}
//output 
//Triangle Area: 25.0
//Rectangle Area: 24.0
