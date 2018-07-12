package com.coding.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coding.test.beans.Vehicle;
import com.coding.test.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@PostMapping()
	public String addVehicle(@RequestBody Vehicle vehicle) {

		vehicleService.insertVehicle(vehicle);
		return "";
	}

	@GetMapping
	public ResponseEntity<Vehicle> getVehicle(@RequestParam("id") int id) {

		Vehicle vehicle = vehicleService.getVehicleById(id);
		if (vehicle == null) {
			return new ResponseEntity<Vehicle>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<Vehicle> updateVehicle(@RequestBody Vehicle vehicle) {

		Vehicle objVehicle = vehicleService.getVehicleById(vehicle.getVehicleId());
		if (objVehicle == null) {
			return new ResponseEntity<Vehicle>(HttpStatus.NOT_FOUND);
		}
		vehicleService.updateVehicle(objVehicle);
		return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
	}

	@GetMapping("/delete")
	public ResponseEntity<Vehicle> deleteLastVehicle() {

		Vehicle vehicle = vehicleService.findLastAddedVehicle();
		vehicleService.deleteVehicleById(vehicle.getVehicleId());
		return new ResponseEntity<Vehicle>(HttpStatus.OK);
	}

}
