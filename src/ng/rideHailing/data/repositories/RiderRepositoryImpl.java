package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Rider;

import java.util.ArrayList;
import java.util.List;

public class RiderRepositoryImpl implements RiderRepository {

    private static List<Rider> riders = new ArrayList<>();
    private static int count;

    @Override
    public Rider save(Rider rider) {
        generateId(rider);
        riders.add(rider);
        return rider;
    }

    private void generateId(Rider rider){
        count++;
        rider.setId(String.valueOf(count));
    }
    @Override
    public void delete(Rider rider) {
        riders.remove(rider);
    }

    @Override
    public void deleteAll() {
        riders.clear();
    }

    @Override
    public long count() {
        return riders.size();
    }

    @Override
    public Rider findById(String id) {
        for (Rider rider : riders) {
            if (rider.getId().equals(id)) return rider;
        }
        return null;
    }
}
