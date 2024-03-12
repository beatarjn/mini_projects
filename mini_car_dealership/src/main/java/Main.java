import cars.Basic;
import cars.Premium;
import cars.Standard;

public class Main {
    public static void main(String[] args) {
        Basic basicCar = new Basic();
        Standard standardCar = new Standard();
        Premium premiumCar = new Premium();

        System.out.println("BASIC");
        basicCar.canDrive();

        System.out.println("STANDARD");
        standardCar.canDrive();
        standardCar.playRadio();

        System.out.println("PREMIUM");
        premiumCar.canDrive();
        premiumCar.playRadio();
        premiumCar.canPark();

    }
}