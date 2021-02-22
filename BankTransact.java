interface BankAccountSpec {

    //Adds money to the account
    public void deposit(int amount);

    //Deducts money from the account
    public boolean withdraw(int amount);

}
