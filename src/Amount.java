public class Amount {
    private double amount;
    private TransactionType transactionType;

    //constructor
    public Amount(double amount, TransactionType transactionType){
        this.amount = amount;
        this.transactionType = transactionType;
    }

    //getter

    public double getAmount() {

        return amount;
    }
    public TransactionType getTransactionType() {

        return transactionType;
    }
    public String toStirng(){

        return this.transactionType + " " + this.amount;
    }
}
