package com.coding.test.service;

import com.coding.test.beans.Vehicle;

public interface VehicleService {

	boolean insertVehicle(Vehicle vehicle);

	Vehicle getVehicleById(int vehicleId);	

	boolean updateVehicle(Vehicle vehicle);
	
	boolean  deleteVehicleById(int vehicleId);

	Vehicle findLastAddedVehicle();

	

}
