public abstract class BankAccount {

    private final String accountNumber ;
    private String accountHolderName ;
    protected double balance;

    public BankAccount (String accountNumber, String accountHolderName , double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit (double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("The amount of " + amount + " has been added to the account number: " + accountNumber );
        } else {
            System.out.println("The input amount is incorrect");
        }
    }

    public void withdraw (double amount) {
         if (amount <=0 || amount > balance) {
            System.out.println("The input amount is incorrect");
        }
        else if (amount > 0 && amount < balance) {
            balance -= amount;
            System.out.println("The amount of " + amount + "has been paid from account number: " + accountNumber);
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;

    }

    public double getBalance() {
        return balance;
    }
}
