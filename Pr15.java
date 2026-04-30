class Employee {
    String name = "Rahul";
    String department = "IT";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 10;
    String project = "Project A";

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + project);
    }
}

public class Pr15 {
    public static void main(String[] args) {

        Employee e = new Employee();
        Manager m = new Manager();

        e.displayDetails();
        System.out.println();
        m.displayDetails();
    }
}//output 
//Employee Name: Rahul
//Department: IT

//Employee Name: Rahul
//Department: IT
//Team Size: 10
//Project: Project A
