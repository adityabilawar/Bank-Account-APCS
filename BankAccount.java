

public class BankAccount {
    private double initialBalance;
    private int accountNumber;

    public BankAccount(int  accountNumber) {
        this.accountNumber = accountNumber;
        initialBalance = 0;
    }
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
    }

    public void deposit(double amount) {
        initialBalance += amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return initialBalance;
    }

    public void withdraw(double amount) {
        initialBalance -= amount;
    }

    @Override
    public String toString() {
        return "Your account number: " + getAccountNumber() + "\nYour balance is: $" + getBalance();
    }
}