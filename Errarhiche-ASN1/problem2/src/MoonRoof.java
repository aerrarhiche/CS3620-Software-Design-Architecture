class MoonRoof extends CarDecorator {
    public MoonRoof(Car car) {
        super(car);
        description = "Moon Roof";
        basePrice = car.basePrice + 1500;
    }
}
