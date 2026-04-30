interface Exam {
    boolean isPassed(int mark);
}

interface Classify {
    String getDivision(double average);
}

class Result implements Exam, Classify {

    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60)
            return "First Division";
        else if (average >= 50)
            return "Second Division";
        else
            return "Third Division";
    }
}

public class Pr17 {
    public static void main(String[] args) {

        Result r = new Result();

        int marks = 45;
        double avg = 62.5;

        System.out.println("Passed: " + r.isPassed(marks));
        System.out.println("Division: " + r.getDivision(avg));
    }
}
// output 
//Passed: true
//Division: First Division
