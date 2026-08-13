package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Rider;

public interface RiderRepository {

    Rider save(Rider rider);
    void delete(Rider rider);
    void deleteAll();
    long count();
    Rider findById(String id);
}
