package Labs.O2OOP;

public class Account {
    int id;
    String owner;
    double balance;

    //constructor
    public Account(int id, String owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
    }

    //methods
    void Deposit(double amount) {
        if(amount < 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        else 
        {
            balance += amount;
        }
    }

    void Withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds");
            return;
        } 
        else 
        {
            balance -= amount;
        }
    }

    public String getDetails() {
        return "Account ID: " + id + ", Owner: " + owner + ", Balance: " + balance;
    }

    public void AddInterest() {
        balance += balance * 0.025; //2.5% interest
    }
}