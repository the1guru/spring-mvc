package com.edocti.jnext.spring.mvc;

import java.util.List;

public interface VehicleDao {
	public void inset(Vehicle v);
	public void update(Vehicle v);
	public void delete(String vehicleNo);
	public Vehicle findVehicleNumber(String vehicleNo);
	public List<Vehicle> getAllVehicles();
}