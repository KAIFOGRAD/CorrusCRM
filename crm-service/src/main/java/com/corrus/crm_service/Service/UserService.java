package com.corrus.crm_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.corrus.crm_service.entity.Vehicle;
import com.corrus.crm_service.repository.VehicleRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
        
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicle()
    {
       List<Vehicle> allVehicle = vehicleRepository.findAll();

       if (allVehicle.isEmpty())
       {
        throw new EntityNotFoundException("No vehicles found");
       }

       return allVehicle;
    }
}
