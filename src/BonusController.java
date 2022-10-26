public class BonusController {
    public double getBonus(Employee e){
        return e.getWage() * e.getBonus();
    }
}
