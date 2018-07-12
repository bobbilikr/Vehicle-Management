package com.coding.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coding.test.model.Vehicle;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@PostMapping
	public ResponseEntity<Void> addVehicle(@RequestBody Vehicle vehicle) {

		vehicleService.insertVehicle(vehicle);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<Vehicle> getVehicle(@PathVariable("id") int id) {
		Vehicle vehicle = vehicleService.getVehicleById(id);
		if (vehicle == null) {
			return new ResponseEntity<Vehicle>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
	}

}
