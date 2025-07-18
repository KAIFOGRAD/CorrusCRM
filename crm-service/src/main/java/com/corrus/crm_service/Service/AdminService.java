package com.corrus.crm_service.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.corrus.crm_service.DTO.VehicleDTO;
import com.corrus.crm_service.Entity.Vehicle;
import com.corrus.crm_service.Repository.VehicleRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AdminService {
    private final VehicleRepository vehicleRepository;

    public Vehicle createVehicle(VehicleDTO vehicleCreateDTO)
    {
        Vehicle vehicle = new Vehicle();
        BeanUtils.copyProperties(vehicleCreateDTO, vehicle);
        return vehicleRepository.save(vehicle);
    }

    public void updateVehicle(long id, VehicleDTO vehicleCreateDTO)
    {
        Vehicle vehicle = vehicleRepository.findById(id)
        .orElseThrow(()-> new EntityNotFoundException("Vehicle not found"));
        
        BeanUtils.copyProperties(vehicleCreateDTO, vehicle);
        vehicleRepository.save(vehicle);
        
    }

    public void deleteVehicle(long id)
    {
        Vehicle vehicle = vehicleRepository.findById(id)
            .orElseThrow(()-> new EntityNotFoundException("Vehicle not found"));
        
        vehicleRepository.delete(vehicle);
    }
    

}
