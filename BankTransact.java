interface BankAccountSpec {

    //Adds money to the account
    public void deposit(int amount);

    //Deducts money from the account
    public boolean withdraw(int amount);

}

/* Sample output:
    Deposited amount: 5000
    Withdrawal amount: 2500
    Current Balance: 2500
*/