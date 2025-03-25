public class TransactionAccount extends BankAccount{

    private final double overDraftLimit = 500;

    public TransactionAccount (String accountNumber , String accountHolderName , double initialBalance ) {
        super(accountNumber ,accountHolderName , initialBalance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("There are no interests for this account");
    }

    @Override
    public void withdraw ( double amount) {
         if (amount <=0 || amount > (balance + overDraftLimit)){
            System.out.println("The input amount is incorrect,or it's more then allowed withdraw");
        }
        else if (amount > 0 && amount <= (balance + overDraftLimit)) {
            balance -= amount;
            System.out.println("The amount of " + amount + "has been paid from the transaction account");
        }
    }
}
