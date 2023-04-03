public class DriverTest {


    public static void main(String[] args) {
        Car bareSedan = new Sedan();
        printVehicleDetails(bareSedan);

        Car sedanWithMoonRoof = new MoonRoof(new Sedan());
        printVehicleDetails(sedanWithMoonRoof);

        Car sportsCarWithOptions = new NavigationSystem(new AlloyWheels(new PremiumSoundSystem(new SportsCar())));
        printVehicleDetails(sportsCarWithOptions);

        Car suvWithOptions = new MoonRoof(new AlloyWheels(new SUV()));
        printVehicleDetails(suvWithOptions);

        Car loadedSUV = new NavigationSystem(new MoonRoof(new AlloyWheels(new PremiumSoundSystem(new SUV()))));
        printVehicleDetails(loadedSUV);
    }

    public static void printVehicleDetails(Car car) {
        System.out.println("Vehicle: " + car.getDescription());
        System.out.println("Price: " + car.getPrice() + "\n");
    }

}
