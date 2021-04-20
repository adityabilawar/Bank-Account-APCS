
import java.util.ArrayList;

public class Bank {
    ArrayList<BankAccount> Banks;

    public Bank() {
        Banks = new ArrayList<>();
    }

    public void addAccount(BankAccount a) {
        Banks.add(a);
    }

    public int count(double atLeast) {
        int counter = 0;
        for (BankAccount object : Banks) {
            if (object.getBalance() >= atLeast)
                counter++;
        }
        return counter;
    }

    public BankAccount find(int accountNumber) {
        BankAccount obj = null;
        for (BankAccount object : Banks) {
            if (object.getAccountNumber() == accountNumber)
                obj = object;
        }
        return obj;
    }

    public BankAccount getMaximum() {
        BankAccount obj = Banks.get(0);
        for (BankAccount object : Banks) {
            if (object.getBalance() > obj.getBalance())
                obj = object;
        }
        return obj;
    }

    public double getTotalBalance() {
        double sum = 0;
        for (BankAccount object : Banks)
            sum += object.getBalance();
        return sum;
    }
}