public class SavingAccount extends BankAccount {

    private final double interestRate = 0.03;

    public SavingAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber , accountHolderName , initialBalance);

    }

    @Override
    public void calculateInterest() {
        double interest = interestRate*balance;
        deposit(interest);
        System.out.println("The saving account interest in the amount of " + interest + " has been add to the account");
    }
}
