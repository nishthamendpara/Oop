class BankAccount {
    String accountHolderName;
    double balance;
    static double interestRate = 5.0;

    BankAccount(String name, double bal) {
        accountHolderName = name;
        balance = bal;
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned: " + interest);
    }

    void display() {
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
    }
}

public class Pr10 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Rahul", 50000);
        b1.display();
        b1.calculateInterest();

        BankAccount.updateInterestRate(7.0);

        System.out.println("\nAfter updating interest rate:");
        b1.calculateInterest();
    }
}
