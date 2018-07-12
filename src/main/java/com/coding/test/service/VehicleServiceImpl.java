package com.coding.test.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.test.beans.Vehicle;
import com.coding.test.repo.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	VehicleRepository repository;

	public boolean insertVehicle(Vehicle v) {
		repository.save(v);
		return true;
	}

	public Vehicle getVehicleById(Long vehicleId) {
		Optional<Vehicle> v = repository.findById(vehicleId);
		if (v.isPresent()) {
			return v.get();
		} else {
			return null;
		}
	}

	public boolean updateVehicle(Vehicle vehicle) {
		repository.save(vehicle);
		return true;
	}

	public boolean deleteVehicleById(Long vehicleId) {
		repository.deleteById(vehicleId);
		return false;
	}

	public Long findLastAddedVehicle() {
		return repository.findLastId();
	}

}
