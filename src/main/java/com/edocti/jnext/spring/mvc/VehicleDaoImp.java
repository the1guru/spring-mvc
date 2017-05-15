package com.edocti.jnext.spring.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class VehicleDaoImp implements VehicleDao{
	private List<Vehicle> vehicles = new ArrayList<>();
	private Vehicle defaultVehicle = new Vehicle();
	
	@Override
	public void inset(Vehicle v) {
		Optional.ofNullable(v).ifPresent(vehicles::add);
	}

	@Override
	public void update(Vehicle v) {
		Predicate<Vehicle> p = x -> x.getVehicleNo().equals(v.getVehicleNo());
		vehicles.stream().filter(p).findAny().ifPresent(x -> {
			x.setColor(v.getColor());
			x.setSeat(v.getSeat());
			x.setWheel(v.getWheel());
		});
	}

	@Override
	public void delete(String vehicleNo) {
		vehicles.removeIf(v -> v.getVehicleNo().equals(vehicleNo));
	}

	@Override
	public Vehicle findVehicleNumber(String vehicleNo) {
		Predicate<Vehicle> p = x -> x.getVehicleNo().equals(vehicleNo);
		return vehicles.stream().filter(p).findAny().orElse(defaultVehicle);
	}

	@Override
	public List<Vehicle> getAllVehicles() {
		return vehicles;
	}

}
