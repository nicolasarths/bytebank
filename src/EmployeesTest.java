public class EmployeesTest {
    public static void main(String[] args) {
        //There might be a manager
        Manager firstManager = new Manager("Nícolas Arths", "000.000.000-12", 47900,"0000");
        Employee firstEmployee = new Employee("Pietra", "000.000.000-13", 120);

        firstManager.printOverview();
        firstEmployee.printOverview();

        System.out.println(firstManager.auth("0000"));
        System.out.println(firstManager.auth("0001"));
    }
}
