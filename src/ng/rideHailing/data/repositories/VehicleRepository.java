package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Vehicle;

public interface VehicleRepository {

    Vehicle save(Vehicle vehicle);
    void delete(Vehicle vehicle);
    void deleteAll();
    long count();
    Vehicle findById(String id);
    
}
