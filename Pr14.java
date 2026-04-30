class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Saving Account Interest: " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount() {
        double maturity = balance * 1.1;
        System.out.println("Fixed Deposit Maturity Amount: " + maturity);
    }
}

public class Pr14 {
    public static void main(String[] args) {

        SavingAccount s = new SavingAccount();
        s.openAccount(101, "Rahul", 10000);
        s.deposit(2000);
        s.withdraw(3000);
        s.checkBalance();
        s.calculateInterest();

        System.out.println();

        FixedDepositAccount f = new FixedDepositAccount();
        f.openAccount(102, "Amit", 20000);
        f.checkBalance();
        f.maturityAmount();
    }// output 
  //Deposited: 2000.0
//Withdrawn: 3000.0
//Account No: 101
//Name: Rahul
//Balance: 9000.0
//Saving Account Interest: 450.0

////Account No: 102
//Name: Amit
//Balance: 20000.0
//Fixed Deposit Maturity Amount: 22000.0
}
