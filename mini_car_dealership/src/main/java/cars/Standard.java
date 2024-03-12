package cars;

import lombok.Data;

@Data
public class Standard extends Basic {

    private boolean airConditioning;

    @Override
    public void canDrive() {
        System.out.println("STANDARD car drives");
    }

    public void playRadio(){
        System.out.println("STANDARD car plays radio");
    }
}
