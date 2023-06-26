public class Leader  extends Employee{
    public Leader(String name, String position, int age, String phone, float salary) {
        super(name, position, age, phone, salary);
    }
    static void raiseSalary(Employee[] employees, float increase) {
        for (Employee employee : employees) {
            if (employee instanceof Leader)continue;
            else{
                employee.setSalary(employee.getSalary()  + increase);
            }
        }
    }
}
