package cars;

import lombok.Data;

@Data
public class Premium extends Standard {

    public void canPark() {
        System.out.println("PREMIUM car parks");
    }
}
