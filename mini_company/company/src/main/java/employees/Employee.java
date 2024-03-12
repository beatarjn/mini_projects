package employees;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

    private String name;
    private String lastName;

    public Employee() {
    }

    public void doEmployeeJob(){
        System.out.println("Employee's job");
    }

}