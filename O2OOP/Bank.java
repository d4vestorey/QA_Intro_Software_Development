package Labs.O2OOP;

public class Bank {
    
    Account[] accounts = new Account[3];
    int nextId = 1;

    //methods
    Account addAccount(String owner, double balance){
        
        Account newAccount = new Account(nextId, owner, balance);
        for(int i = 0; i < accounts.length; i++){ //accounts.length will always return 3 due to the way it was created
            if(accounts[i] == null){
                accounts[i] = newAccount;
                nextId++;
                return newAccount;
            }
        }
        System.out.println("Bank is full, cannot add more accounts");
        return null;
    }

    Account getAccount(String owner){
        for(Account acc : accounts){
            if(acc != null && acc.owner.equals(owner)){
                System.out.println("Account found for owner: " + owner);
                return acc;
            }
        }
        System.out.println("Account not found for owner: " + owner);
        return null;
    }
    //This method iteratively calls the getDetails() method from the Account class on each 
    //element of the array storing the accounts
    public void printAccounts() {
    for (Account acc : accounts) {
        if (acc != null) {
            System.out.println(acc.getDetails());
        }
    }
}

}
