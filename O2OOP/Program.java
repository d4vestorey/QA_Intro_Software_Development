package Labs.O2OOP;

public class Program {
    public static void main(String[] args) {
        
        Account account1 = new Account(1, "Alice", 1000.0);
        Account account2 = new Account(2, "Bob", 1500.0);
        Account account3 = new Account(3, "Charlie", 2000.0);

        Account myAccount = new Account(4, "Dave", 100.0);
        Account partnerAccount = myAccount; //reference to the same object
        //account1.AddInterest();
        //System.out.println(account1.getDetails());
        partnerAccount.AddInterest();
        System.out.println(partnerAccount.getDetails());

        //Both myAccount and partnerAccount point to the same Account object in memory.
        //When you call myAccount.AddInterest(), it modifies the balance field inside that single object.

        processAccount(myAccount); //method that calls the AddInsterest method
        
        
        //PART2
        Account[] accounts = {account1, account2, account3};

        /*for(Account acc : accounts) {
            System.out.println(acc.getDetails());
        }*/

        int k = 100;

        incInt(k);
        System.out.println("k after incInt: " + k); //k is still 100 because primitives are passed by value


        Bank bank = new Bank();
        bank.addAccount("Dave", 1000.0);
        bank.addAccount("Eric", 1500.0);
        bank.addAccount("Fred", 2000.0);

        bank.printAccounts();



    }

    static void processAccount(Account acc) {
        acc.AddInterest();
        System.out.println("Processed account: " + acc.getDetails());
    }

    private static void incInt(int x) {
        x++;
    }
}
