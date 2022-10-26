public class Employee extends Person {
    private double wage;

    public Employee (String name, String cpf, double wage) {
        super(name, cpf);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void increaseWage(double amount) {
        if (amount > 0) this.wage += amount;
    }

    public double getBonus () {
        return 0.1;
    }

    public void printOverview(){
        System.out.println("Printing overview of " + super.getName());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Wage: " + this.getWage());
        System.out.println("Bonus: " + this.getBonus());
    }
}
