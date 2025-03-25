import java.util.ArrayList;

public class BankCustomers {

    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        for (BankAccount accounts : accountsList) {
            System.out.println("Account number: " + accounts.getAccountNumber() + "\nAccount holder: " + accounts.getAccountHolderName() + "\nBlanace: " + accounts.getBalance());
            System.out.println();
        }
    }

    public BankAccount findAccount (String accountNumber) {
        for(BankAccount account : accountsList ) {
            if(account.getAccountNumber().equals(accountNumber)) {
                System.out.println("Account number: " + account.getAccountNumber() + "\nAccount holder: " + account.getAccountHolderName() + "\nBlanace: " + account.getBalance());
                return account;
            }
        }
        System.out.println("There are no accounts with number: " + accountNumber);
        return null;
    }
}
