package com.coding.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding.test.beans.Vehicle;
import com.coding.test.repo.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {
	
	@Autowired
	VehicleRepository repository;

	public boolean insertVehicle(Vehicle vehicle) {
		//repository.save(vehicle);
		return true;
	}

	public Vehicle getVehicleById(int vehicleId) {
		return null;
	}

	public boolean updateVehicle(Vehicle vehicle) {
		return false;
	}

	public boolean deleteVehicleById(int vehicleId) {
		return false;
	}

}
