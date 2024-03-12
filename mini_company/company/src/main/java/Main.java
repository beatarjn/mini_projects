import employees.Director;
import employees.Employee;
import employees.Manager;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Adam", "Employee");
        Manager manager = new Manager("Jan", "Manager", Collections.singletonList(employee));
        Director director = new Director("Piotr", "Director", Collections.singletonList(manager));

        employee.doEmployeeJob();
        System.out.println("Manager does employee job: ");
        manager.doEmployeeJob();
        System.out.println("Manager orders employee job: ");
        manager.orderJob(employee);
        System.out.println("Director does employee job: ");
        director.doEmployeeJob();
        System.out.println("Director does manager job: ");
        director.doManagerJob();
        System.out.println("Director orders manager job: ");
        director.orderManagerJob(manager);
    }
}