package com.coding.test.service;

import com.coding.test.beans.Vehicle;

public interface VehicleService {

	boolean insertVehicle(Vehicle vehicle);

	Vehicle getVehicleById(Long vehicleId);	

	boolean updateVehicle(Vehicle vehicle);
	
	boolean  deleteVehicleById(Long vehicleId);

	Long findLastAddedVehicle();

	

}
