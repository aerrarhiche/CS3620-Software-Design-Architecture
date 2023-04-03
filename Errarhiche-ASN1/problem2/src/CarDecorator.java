abstract class CarDecorator extends Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return car.getDescription() + " with " + description;
    }
}
