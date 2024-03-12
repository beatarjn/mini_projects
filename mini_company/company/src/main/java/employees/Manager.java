package employees;

import lombok.Data;

import java.util.List;

@Data
public class Manager extends Employee {

    private List<Employee> employees;

    public Manager(){}

    public Manager(String name, String lastName) {
        super(name, lastName);
    }

    public Manager(String name, String lastName, List<Employee> employees) {
        super(name, lastName);
        this.employees = employees;
    }

    public void doManagerJob(){
        System.out.println("Manager's job");
    }

    public void orderJob(Employee employee){
        employee.doEmployeeJob();
    }


}