import java.sql.Date;

public class Employee implements Comparable<Employee>{
    private String name;
    String position;
    int age;
    String phone;
    float salary;

    //Написать прототип компаратора - метод внутри класса сотрудника,
    // сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
    // без использования условного оператора.
    public static int compareDate(Date date1, Date date2){
        return date1.compareTo(date2);
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
    public Employee(String name, String position, int age, String phone, float salary) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.phone = phone;
        this.salary = salary;
    }


    public void printEmployee() {
        System.out.printf("Name:  %s\n Position: %s\n Age: %d\n Phone: %s\n Salary: %s\n", name, position, age, phone, salary) ;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    //компаратор по зарплате
//    @Override
    public int compareToSalary(Employee employee2) {
        if(this.getSalary() > employee2.getSalary()){
            return 1;
        } else if (this.getSalary() < employee2.getSalary()) {
            return -1;
        }else return 0;
    }

    // компаратор по возрасту
    @Override
    public int compareTo(Employee employee2) {
        int result;
        if (this.getAge() > employee2.getAge()) {
            result = 1;
        } else if (this.getAge() < employee2.getAge()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
