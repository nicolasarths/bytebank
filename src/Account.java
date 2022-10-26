public class Account {
    private double balance;
    private final int agency;
    private final int number;
    private final Client owner;

    public Account (int agency, int number, Client owner){
        this.agency = agency;
        this.number = number;
        this.owner = owner;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw (double amount) {
        double afterWithdraw = this.balance - amount;
        if (afterWithdraw < 0) return false;
        this.balance = afterWithdraw;
        return true;
    }

    public boolean transfer (double amount, Account account){
        if (this.withdraw(amount)) {
            account.deposit(amount);
            return true;
        }
        else return false;
    }

    public Client getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }
}
