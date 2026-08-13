package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriverRepositoryImpl implements DriverRepository {
    private static List<Driver> drivers = new ArrayList<>();
    private static int count;

    @Override
    public Driver save(Driver driver) {
        generateId(driver);
        drivers.add(driver);
        return driver;
    }

    private void generateId(Driver driver){
        count++;
        driver.setId(String.valueOf(count));
    }
    @Override
    public void delete(Driver driver) {
        drivers.remove(driver);
    }

    @Override
    public void deleteAll() {
        drivers.clear();
    }

    @Override
    public long count() {
        return drivers.size();
    }

    @Override
    public Driver findById(String id) {
        for (Driver driver : drivers) {
            if (driver.getId().equals(id)) return driver;
        }
        return null;
    }
}
