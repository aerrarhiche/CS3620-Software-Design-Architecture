class AlloyWheels extends CarDecorator {
    public AlloyWheels(Car car) {
        super(car);
        description = "Alloy Wheels";
        basePrice = car.basePrice + 2000;
    }
}
