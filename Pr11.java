import java.util.Scanner;

class College {
    String collegeName;

    College(String name) {
        collegeName = name;
    }

    class Admission {
        String studentName;
        String course;

        void readData() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();
            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        void displayData() {
            System.out.println("\nCollege: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class Pr11 {
    public static void main(String[] args) {
        College c = new College("ABC College");
        College.Admission a = c.new Admission();

        a.readData();
        a.displayData();
    }
}
