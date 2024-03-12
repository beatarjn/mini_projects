package cars;

import lombok.Data;

@Data
public class Basic {

    private String steeringWheel;
    private String carWindow;
    private int wheels;

    public void canDrive() {
        System.out.println("BASIC car drives");
    }


}