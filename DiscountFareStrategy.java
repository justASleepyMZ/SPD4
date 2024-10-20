public class DiscountFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distance, double duration) {
        return (distance * 0.80) + (duration * 0.20);
    }
}
