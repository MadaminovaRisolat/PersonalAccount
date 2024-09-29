import java.util.ArrayList;
/**
 * The PersonalAccount class represents a bank account.
 * It manages deposits, withdrawals, and transaction history.
 */
public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions;

    //Constructor to initialize account
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Amount(amount, TransactionType.DEPOSIT));
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add(new Amount(amount, TransactionType.WITHDRAWAL));
            System.out.println("New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    // Method to print the transaction history
    public void printTransactionHistory() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
        } else {
            for (Amount transaction : transactions) {
                System.out.println(transaction);
            }
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to get the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to get the account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }
}
