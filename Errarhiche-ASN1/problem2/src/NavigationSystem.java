class NavigationSystem extends CarDecorator {
    public NavigationSystem(Car car) {
        super(car);
        description = "Navigation System";
        basePrice = car.basePrice + 1800;
    }
}
