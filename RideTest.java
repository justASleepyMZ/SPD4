public class RideTest {
    public static void main(String[] args) {

        RideContext ride = new RideContext(new RegularFareStrategy());
        System.out.println("Regular Fare: " + ride.calculateFare(10, 15));


        ride.setFareStrategy(new SurgeFareStrategy());
        System.out.println("Surge Fare: " + ride.calculateFare(10, 15));


        ride.setFareStrategy(new DiscountFareStrategy());
        System.out.println("Discount Fare: " + ride.calculateFare(10, 15));


        ride.chooseStrategy("Premium", false);
        System.out.println("Premium Fare: " + ride.calculateFare(10, 15));
    }
}
