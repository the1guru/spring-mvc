package com.edocti.jnext.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private VehicleDao vehicleDao;

	@Override
	public List<Vehicle> getAllVehicles() {
		return vehicleDao.getAllVehicles();
	}

	@Override
	public Vehicle findVehicle(String vehicleNo) {
		return vehicleDao.findVehicleNumber(vehicleNo);
	}

	@Override
	public void addVehicle(Vehicle v) {
		vehicleDao.inset(v);
	}

	@Override
	public void updateVehicle(Vehicle v) {
		vehicleDao.update(v);
	}

	@Override
	public void removeVehicle(Vehicle v) {
		vehicleDao.delete(v.getVehicleNo());
	}
}