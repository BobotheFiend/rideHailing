package ng.rideHailing.data.models;

import java.util.ArrayList;
import java.util.List;

public class Driver extends User {
    private boolean isAvailable;
    private List<Ratings> ratings = new ArrayList<>();
    private Vehicle vehicle;

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Ratings> getRatings() {
        return ratings;
    }

    public void setRatings(List<Ratings> ratings) {
        this.ratings = ratings;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}