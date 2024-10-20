public class RideContext {
    private FareStrategy fareStrategy;
    private static final double MINIMUM_FARE = 5.00;

    public RideContext(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    public void setFareStrategy(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    public double calculateFare(double distance, double duration) {
        if (distance < 0 || duration < 0) {
            throw new IllegalArgumentException("Distance and duration must be non-negative");
        }

        double fare = fareStrategy.calculateFare(distance, duration);
        return Math.max(fare, MINIMUM_FARE);
    }

    public void chooseStrategy(String rideType, boolean isPeakHour) {
        switch (rideType) {
            case "Premium":
                setFareStrategy(new PremiumFareStrategy());
                break;
            case "Discount":
                setFareStrategy(new DiscountFareStrategy());
                break;
            case "Regular":
                setFareStrategy(isPeakHour ? new SurgeFareStrategy() : new RegularFareStrategy());
                break;
            default:
                throw new IllegalArgumentException("Unknown ride type");
        }
    }
}
