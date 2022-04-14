public class PremiumRides {
    public static PremiumRides Normal;

    private final double costperkm;
    private final double costpermin;

    PremiumRides(double costperkm, double costpermin, double minfare){
        this.costperkm=costperkm;
        this.costpermin=costpermin;
    }

    public double calcCostOfCabRide(Rides ride) {
        return ride.distance * costperkm + ride.time * costpermin;
    }
}