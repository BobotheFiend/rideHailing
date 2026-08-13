package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Driver;

public interface DriverRepository {

    Driver save(Driver driver);
    void delete(Driver driver);
    void deleteAll();
    long count();
    Driver findById(String id);
}
