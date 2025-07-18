package com.corrus.crm_service.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.corrus.crm_service.Entity.Vehicle;
import com.corrus.crm_service.Repository.VehicleRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
        
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicle()
    {
        return vehicleRepository.findAll();
    }
}
