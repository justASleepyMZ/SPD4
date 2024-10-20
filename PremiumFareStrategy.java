public class PremiumFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distance, double duration) {
        return (distance * 2.00) + (duration * 0.50);
    }
}
