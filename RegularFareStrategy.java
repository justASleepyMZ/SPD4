public class RegularFareStrategy implements FareStrategy {
    @Override
    public double calculateFare(double distance, double duration) {
        return (distance * 1.00) + (duration * 0.25);
    }
}
