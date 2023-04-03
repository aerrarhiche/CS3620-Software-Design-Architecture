class PremiumSoundSystem extends CarDecorator {
    public PremiumSoundSystem(Car car) {
        super(car);
        description = "Premium Sound System";
        basePrice = car.basePrice + 1000;
    }
}
