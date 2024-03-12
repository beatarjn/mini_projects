package employees;

import lombok.Data;

import java.util.List;

@Data
public class Director extends Manager {

    private List<Manager> managers;

    public Director(String name, String lastName, List<Manager> managers ) {
        super(name, lastName);
        this.managers = managers;
    }

    public void orderManagerJob(Manager manager){
        manager.doManagerJob();
    }
}
