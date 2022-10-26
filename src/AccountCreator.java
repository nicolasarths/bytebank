public class AccountCreator {
    public static void main(String[] args) {

        Client firstClient = new Client("Alberto Roberto", "000.000.000-00");
        Client secondClient = new Client("Diego Fernandes", "000.000.000-01");
        Account firstAccount = new Account(1,100, firstClient);
        Account secondAccount = new Account(1, 101, secondClient);

        secondAccount.deposit(1230);

        System.out.println("Before transference;");
        System.out.println("First account data:");
        System.out.println("Account agency: " + firstAccount.getAgency());
        System.out.println("Account number: " + firstAccount.getNumber());
        System.out.println("Account owner: " + firstAccount.getOwner().getName());
        System.out.println("Account balance: " + firstAccount.getBalance());

        System.out.println("Second account data:");
        System.out.println("Account agency: " + secondAccount.getAgency());
        System.out.println("Account number: " + secondAccount.getNumber());
        System.out.println("Account owner: " + secondAccount.getOwner().getName());
        System.out.println("Account balance: " + secondAccount.getBalance());
        System.out.println();

        secondAccount.transfer(390, firstAccount);

        System.out.println("After transference;");
        System.out.println("First account data:");
        System.out.println("Account agency: " + firstAccount.getAgency());
        System.out.println("Account number: " + firstAccount.getNumber());
        System.out.println("Account owner: " + firstAccount.getOwner().getName());
        System.out.println("Account balance: " + firstAccount.getBalance());

        System.out.println("Second account data:");
        System.out.println("Account agency: " + secondAccount.getAgency());
        System.out.println("Account number: " + secondAccount.getNumber());
        System.out.println("Account owner: " + secondAccount.getOwner().getName());
        System.out.println("Account balance: " + secondAccount.getBalance());
        System.out.println();

        secondAccount.transfer(5970, secondAccount);

        System.out.println("After invalid transference balance;");
        System.out.println("First account data:");
        System.out.println("Account agency: " + firstAccount.getAgency());
        System.out.println("Account number: " + firstAccount.getNumber());
        System.out.println("Account owner: " + firstAccount.getOwner().getName());
        System.out.println("Account balance: " + firstAccount.getBalance());

        System.out.println("Second account data:");
        System.out.println("Account agency: " + secondAccount.getAgency());
        System.out.println("Account number: " + secondAccount.getNumber());
        System.out.println("Account owner: " + secondAccount.getOwner().getName());
        System.out.println("Account balance: " + secondAccount.getBalance());
    }
}
