public class Main {
    public static void main(String[] args) {
        BankCustomers bank = new BankCustomers();

        //creating 3 transaction accounts
        TransactionAccount t1 = new TransactionAccount("13020" , "sara" , 5000);
        TransactionAccount t2 = new TransactionAccount("13022" , "fatemeh" , 5500);
        TransactionAccount t3 = new TransactionAccount("13028" , "yekta" , 6500);

        //creating 3 savings accounts
        SavingAccount s1 = new SavingAccount("58591" , "alireza" , 6000);
        SavingAccount s2 = new SavingAccount("58592" , "mohamad" , 5000);
        SavingAccount s3 = new SavingAccount("58593" , "khosro" , 6500);

        //adding the accounts to thr bank
        bank.addAccount(t1);
        bank.addAccount(t2);
        bank.addAccount(t3);
        bank.addAccount(s1);
        bank.addAccount(s2);
        bank.addAccount(s3);

        //finding accounts(one exists anf the other doesn't)
        bank.findAccount("13022");
        bank.findAccount("13025");

        //printing initial balance of an account then adding a deposit
        System.out.println(s1.getBalance());
        s1.deposit(50);
        System.out.println(s1.getBalance());

        //trying an invalid deposit
        t1.deposit(-550);

        //calculating interest
        s2.calculateInterest();
        t2.calculateInterest();

        //withdrawing
        s1.withdraw(10.10);
        s2.withdraw(-8);
        s3.withdraw(1000000);

        //withdrawing
        t1.withdraw(10.10);
        t2.withdraw(-8);
        t3.withdraw(1000000);

        //printing all balances
        bank.showAllBalances();

    }
}