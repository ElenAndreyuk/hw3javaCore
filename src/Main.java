//Опишите класс руководителя, наследник от сотрудника.
// Перенесите статический метод повышения зарплаты
// (сделать статическим) в класс руководителя, модифицируйте метод таким образом,
// чтобы он мог поднять заработную плату всем, кроме руководителей.
// В основной программе создайте руководителя и поместите его в общий массив сотрудников.
// Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
// 2.(*) Сделать компараторы для Сотрудников на основе ЗП и Возраста
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "developer", 33, "+444555666", 300000 );
        Employee employee2 = new Employee("Petrov Petr Petrovich", "tester", 30, "+344555666", 30000 );
        Leader lead  = new Leader("Sidorov Anton Antonovich", "director", 55, "+765443634", 500000);
        Employee[] employees = {employee1, employee2, lead}; // создаем команду
        lead.raiseSalary(employees, 10);  // повышаем зарплату
        for (Employee employee: employees) {
            employee.printEmployee();
        }
        System.out.println(employee1.compareTo(employee2));
        System.out.println(employee1.compareToSalary(employee2));



    }
}