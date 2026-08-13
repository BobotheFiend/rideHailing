package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepositoryImpl implements VehicleRepository {

    private static List<Vehicle> vehicles = new ArrayList<>();
    private static int count;

    @Override
    public Vehicle save(Vehicle vehicle) {
        generateId(vehicle);
        vehicles.add(vehicle);
        return vehicle;
    }

    private void generateId(Vehicle vehicle){
        count++;
        vehicle.setId(String.valueOf(count));
    }
    @Override
    public void delete(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
    }

    @Override
    public long count() {
        return vehicles.size();
    }

    @Override
    public Vehicle findById(String id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId().equals(id)) return vehicle;
        }
        return null;
    }
    
}
