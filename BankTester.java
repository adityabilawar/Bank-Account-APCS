//This program tests the Bank class.

public class BankTester {
	public static void main(String[] args) {
		Bank firstBankOfJava = new Bank();
		firstBankOfJava.addAccount(new BankAccount(1001, 20000));
		firstBankOfJava.addAccount(new BankAccount(1015, 10000));
		firstBankOfJava.addAccount(new BankAccount(1729, 15000));

		System.out.println(String.format("Total of all Accounts: $%,.2f",
				firstBankOfJava.getTotalBalance()));

		double threshold = 15000;
		int c = firstBankOfJava.count(threshold);
		System.out.println(String.format(
				"Number accounts with balance of $%,.2f or more: %d",
				threshold, c));

		int accountNumber = 1015;
		BankAccount a = firstBankOfJava.find(accountNumber);
		if (a == null)
			System.out.println("No account with number " + accountNumber);
		else
			System.out.println(String.format(
					"Account with number %d  has balance $%,.2f",
					accountNumber, a.getBalance()));

		BankAccount max = firstBankOfJava.getMaximum();
		System.out.println("Account with number " + max.getAccountNumber()
				+ " has the largest balance.");

	}
}
