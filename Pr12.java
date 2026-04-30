class Volume {

    void calculateVolume(int side) {
        System.out.println("Cube Volume: " + (side * side * side));
    }

    void calculateVolume(int l, int w, int h) {
        System.out.println("Rectangular Cube Volume: " + (l * w * h));
    }

    void calculateVolume(double r) {
        double volume = (4.0 / 3) * Math.PI * r * r * r;
        System.out.println("Sphere Volume: " + volume);
    }
}

public class Pr12 {
    public static void main(String[] args) {
        Volume v = new Volume();
        v.calculateVolume(3);
        v.calculateVolume(2, 3, 4);
        v.calculateVolume(2.5);
    }
}
