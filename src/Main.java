public class Main {
    public static void main(String[] args) {
        // Create a personal account
        PersonalAccount account = new PersonalAccount(2001, "Emily Watson");

        // Deposit amounts
        account.deposit(500);
        account.deposit(200);

        // Withdraw amounts
        account.withdraw(100);
        account.withdraw(700); // This should print an error message due to insufficient balance

        // Print transaction history
        account.printTransactionHistory();

        // Display account information
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
