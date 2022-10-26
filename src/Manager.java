public class Manager extends Employee{
    private final String password;

    public Manager (String name, String cpf, double wage, String password){
        super(name, cpf, wage);
        this.password = password;
    }

    public boolean auth(String password){
        return password.equals(this.password);
    }

    @Override
    public double getBonus(){
        return super.getBonus() + 0.5;
    }
}
